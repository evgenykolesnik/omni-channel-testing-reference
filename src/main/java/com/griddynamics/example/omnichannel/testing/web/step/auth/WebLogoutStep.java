package com.griddynamics.example.omnichannel.testing.web.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;
import com.griddynamics.example.omnichannel.testing.web.page.LogoutPage;

public class WebLogoutStep implements LogoutStep {

  private final LogoutPage logoutPage;

  @Inject
  public WebLogoutStep(LogoutPage logoutPage) {
    this.logoutPage = logoutPage;
  }

  public void logout() {
    logoutPage.getLogoutButton().click();
  }
}
