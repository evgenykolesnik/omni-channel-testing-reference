package com.griddynamics.example.omnichannel.testing.ios.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.ios.screen.LoginScreen;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;

public class IOSLoginStep implements LoginStep {

  private final LoginScreen loginScreen;

  @Inject
  public IOSLoginStep(LoginScreen loginScreen) {
    this.loginScreen = loginScreen;
  }

  public void login(String login, String password) {
    loginScreen.getEmailField().sendKeys(login);
    loginScreen.getPasswordField().sendKeys(password);
    loginScreen.getSubmitButton().click();
  }
}
