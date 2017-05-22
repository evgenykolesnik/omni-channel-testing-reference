package com.griddynamics.example.omnichannel.testing.ios.screen;

import com.griddynamics.example.omnichannel.testing.utility.UiElement;

public class LogoutScreen {

  private final UiElement logoutButton;

  public LogoutScreen() {
    this.logoutButton = new UiElement("Logout button");
  }

  public UiElement getLogoutButton() {
    return logoutButton;
  }
}
