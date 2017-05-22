package com.griddynamics.example.omnichannel.testing.web.step.auth;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;

public class WebAuthModule extends AbstractModule {

  private static final WebAuthModule instance = new WebAuthModule();

  private WebAuthModule() {
  }

  public static WebAuthModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(LoginStep.class).to(WebLoginStep.class);
    bind(LogoutStep.class).to(WebLogoutStep.class);
  }
}
