package com.griddynamics.example.omnichannel.testing.ios.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.ios.screen.LogoutScreen;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;

public class IOSLogoutStep implements LogoutStep {

  private final LogoutScreen logoutScreen;

  @Inject
  public IOSLogoutStep(LogoutScreen logoutScreen) {
    this.logoutScreen = logoutScreen;
  }

  public void logout() {
    logoutScreen.getLogoutButton().click();
  }
}
