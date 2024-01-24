package com.thehutgroup.accelerator.connectn.player;

import java.util.ArrayList;

public class Hug extends Player {

  static final int boardWidth = 10;
  static final int boardHeight = 8;

  public Hug(Counter counter) {
    super(counter, Hug.class.getName());
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
