package com.griddynamics.example.omnichannel.testing.web.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.web.page.LoginPage;

public class WebLoginStep implements LoginStep {

  private final LoginPage loginPage;

  @Inject
  public WebLoginStep(LoginPage loginPage) {
    this.loginPage = loginPage;
  }

  public void login(String login, String password) {
    loginPage.getEmailField().sendKeys(login);
    loginPage.getPasswordField().sendKeys(password);
    loginPage.getSubmitButton().click();
  }
}
