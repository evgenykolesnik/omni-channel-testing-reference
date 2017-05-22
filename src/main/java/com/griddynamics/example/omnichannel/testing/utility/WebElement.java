package com.griddynamics.example.omnichannel.testing.utility;

import java.util.logging.Logger;

public class WebElement {

  private static final Logger logger = Logger.getLogger(WebElement.class.getName());

  private final String name;

  public WebElement(String name) {
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
