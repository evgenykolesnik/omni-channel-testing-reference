package com.griddynamics.example.omnichannel.testing.ios.step.checkout.applepay;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;

public class IOSApplePayCheckoutModule extends AbstractModule {

  private static final IOSApplePayCheckoutModule instance = new IOSApplePayCheckoutModule();

  private IOSApplePayCheckoutModule() {
  }

  public static IOSApplePayCheckoutModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CheckoutStep.class).to(IOSApplePayCheckoutStep.class);
  }
}
