package com.griddynamics.example.omnichannel.testing.api.step.auth;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class ApiLogoutStep implements LogoutStep {

  private final HttpClient httpClient;

  @Inject
  public ApiLogoutStep(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public void logout() {
    httpClient.doPost("logout", null);
  }
}
