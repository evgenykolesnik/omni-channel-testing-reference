package com.griddynamics.example.omnichannel.testing.ios.step.checkout.base;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;

public class IOSCheckoutModule extends AbstractModule {

  private static final IOSCheckoutModule instance = new IOSCheckoutModule();

  private IOSCheckoutModule() {
  }

  public static IOSCheckoutModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CheckoutStep.class).to(IOSCheckoutStep.class);
  }
}
