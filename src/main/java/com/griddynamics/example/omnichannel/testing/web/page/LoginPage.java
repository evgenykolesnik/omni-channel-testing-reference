package com.griddynamics.example.omnichannel.testing.web.page;

import com.griddynamics.example.omnichannel.testing.utility.WebElement;

public class LoginPage {

  private final WebElement emailField;
  private final WebElement passwordField;
  private final WebElement submitButton;

  public LoginPage() {
    emailField = new WebElement("Email field");
    passwordField = new WebElement("Password field");
    submitButton = new WebElement("Submit button");
  }

  public WebElement getEmailField() {
    return emailField;
  }

  public WebElement getPasswordField() {
    return passwordField;
  }

  public WebElement getSubmitButton() {
    return submitButton;
  }
}
