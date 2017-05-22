package com.griddynamics.example.omnichannel.testing.web.page;

import com.griddynamics.example.omnichannel.testing.utility.WebElement;

public class LogoutPage {

  private final WebElement logoutButton;

  public LogoutPage() {
    this.logoutButton = new WebElement("Logout button");
  }

  public WebElement getLogoutButton() {
    return logoutButton;
  }
}
