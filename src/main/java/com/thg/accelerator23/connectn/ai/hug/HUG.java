package com.thg.accelerator23.connectn.ai.hug;

import com.thehutgroup.accelerator.connectn.player.Board;
import com.thehutgroup.accelerator.connectn.player.Counter;
import com.thehutgroup.accelerator.connectn.player.Player;

public class HUG extends Player {
  public HUG(Counter counter) {
    //TODO: fill in your name here
    super(counter, HUG.class.getName());
  }

  @Override
  public int makeMove(Board board) {
    int board_width = 10;
    int board_height = 8;

    int minimum = 1;
    int maximum = board_width;

    int random = (int)Math.floor(Math.random()* (maximum - minimum+1) +minimum);
    return random;
  }
}
