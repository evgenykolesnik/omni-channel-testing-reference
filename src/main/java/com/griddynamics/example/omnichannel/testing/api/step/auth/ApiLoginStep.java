package com.griddynamics.example.omnichannel.testing.api.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class ApiLoginStep implements LoginStep {

  private final HttpClient httpClient;

  @Inject
  public ApiLoginStep(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public void login(String login, String password) {
    String request = String.format("login=%s,password=%s", login, password);
    httpClient.doPost("auth", request);
  }
}
