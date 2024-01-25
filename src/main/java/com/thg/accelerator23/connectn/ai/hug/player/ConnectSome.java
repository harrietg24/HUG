package com.thehutgroup.accelerator.connectn.player;

import java.util.ArrayList;

public class ConnectSome extends Player {

    static final int boardWidth = 10;
    static final int boardHeight = 8;

    public ConnectSome(Counter counter) {
        super(counter, ConnectSome.class.getName());
    }

    public int blockThreeVertical(Board board) {
        // columns
        for (int i = 0; i < 10; i++) {
            //rows
            for (int j = 0; j < (8 - 1); j++) {
                if (board.getCounterAtPosition(new Position(i, j)) ==
                        board.getCounterAtPosition(new Position(i, j + 1))
                        && board.getCounterAtPosition(new Position(i, j + 1)) ==
                        board.getCounterAtPosition(new Position(i, j + 2))
                        && board.hasCounterAtPosition(new Position(i, j))) {
                    int c = i;
                    return c;
                }
            }
        }
        return 100;
    }

    //public int blockThreeOnBottomRow(Board board) {}

    public int makeMove(Board board) {
        if (blockThreeVertical(board) < 8) {
            return blockThreeVertical(board);
        } else
        if (!board.hasCounterAtPosition(new Position(4, 0)) && !board.hasCounterAtPosition(new Position(4, 7))) {
            System.out.println(board.getCounterAtPosition(new Position(4,0)));
            return 4;
        } else if (!board.hasCounterAtPosition(new Position(5, 0)) && !board.hasCounterAtPosition(new Position(5, 7))) {
            System.out.println(board.getCounterAtPosition(new Position(5,0)));
            return 5;
        } else {
            ArrayList possiblePositions = new ArrayList<>();
            for (int i = 0; i < boardWidth; i++) {
                if (!board.hasCounterAtPosition(new Position(i, boardHeight))) {
                    possiblePositions.add(i);
                }
            }
            return (int) (possiblePositions.size() * Math.random());
        }
    }
}
