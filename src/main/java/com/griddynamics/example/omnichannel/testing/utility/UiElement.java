package com.griddynamics.example.omnichannel.testing.utility;

import java.util.logging.Logger;

public class UiElement {

  private static final Logger logger = Logger.getLogger(UiElement.class.getName());

  private final String name;

  public UiElement(String name) {
    this.name = name;
  }

  public void click() {
    logger.info(String.format("Click on '%s'", name));
  }

  public void sendKeys(String keys) {
    logger.info(String.format("Send keys '%s' to '%s'", keys, name));
  }

  public String getText() {
    logger.info(String.format("Return text of '%s'", name));
    return name;
  }
}
