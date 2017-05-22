package com.griddynamics.example.omnichannel.testing.ios.screen;

import com.griddynamics.example.omnichannel.testing.utility.UiElement;

public class LoginScreen {

  private final UiElement emailField;
  private final UiElement passwordField;
  private final UiElement submitButton;

  public LoginScreen() {
    emailField = new UiElement("Email field");
    passwordField = new UiElement("Password field");
    submitButton = new UiElement("Submit button");
  }

  public UiElement getEmailField() {
    return emailField;
  }

  public UiElement getPasswordField() {
    return passwordField;
  }

  public UiElement getSubmitButton() {
    return submitButton;
  }
}
