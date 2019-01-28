package edu.cnm.deepdive;

import jdk.jshell.execution.Util;

public class LazyThread extends Thread {

  @Override
  public void run() {
    Utility.takeNap(10_000);
  }
}
