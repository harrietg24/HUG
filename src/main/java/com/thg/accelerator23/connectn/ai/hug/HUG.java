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
    int minimum = 1;
    int maximum = 10;

    int random = (int)Math.floor(Math.random()* (maximum - minimum+1) +minimum);
    return random;
  }
}
