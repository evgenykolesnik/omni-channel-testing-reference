package com.griddynamics.example.omnichannel.testing.api.step.auth;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;

public class ApiAuthModule extends AbstractModule {

  private static final ApiAuthModule instance = new ApiAuthModule();

  private ApiAuthModule() {
  }

  public static ApiAuthModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(LoginStep.class).to(ApiLoginStep.class);
    bind(LogoutStep.class).to(ApiLogoutStep.class);
  }
}
