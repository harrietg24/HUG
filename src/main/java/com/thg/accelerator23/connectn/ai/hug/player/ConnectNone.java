package com.thehutgroup.accelerator.connectn.player;

import java.util.ArrayList;

public class ConnectNone extends Player {

  static final int boardWidth = 10;
  static final int boardHeight = 8;

  public ConnectNone(Counter counter) {
    super(counter, ConnectNone.class.getName());
  }

  public int makeMove(Board board) {
    ArrayList possiblePositions = new ArrayList<>();
    for (int i = 0; i < boardWidth; i++) {
      if (!board.hasCounterAtPosition(new Position(i, boardHeight))) {
        possiblePositions.add(i);
      }
    }
    return (int) (possiblePositions.size() * Math.random());
  }
}
