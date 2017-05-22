package com.griddynamics.example.omnichannel.testing.ios.step.auth;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.step.auth.LogoutStep;

public class IOSAuthModule extends AbstractModule {

  private static final IOSAuthModule instance = new IOSAuthModule();

  private IOSAuthModule() {
  }

  public static IOSAuthModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(LoginStep.class).to(IOSLoginStep.class);
    bind(LogoutStep.class).to(IOSLogoutStep.class);
  }
}
