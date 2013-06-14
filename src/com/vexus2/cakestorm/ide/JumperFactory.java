package com.vexus2.cakestorm.ide;

public class JumperFactory {
  private static JumperFactory ourInstance = new JumperFactory();

  public static JumperFactory getInstance() {
    return ourInstance;
  }

  private JumperFactory() {
  }
}
