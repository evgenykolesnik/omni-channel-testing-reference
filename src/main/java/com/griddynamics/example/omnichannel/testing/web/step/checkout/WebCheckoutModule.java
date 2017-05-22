package com.griddynamics.example.omnichannel.testing.web.step.checkout;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;

public class WebCheckoutModule extends AbstractModule {

  private static final WebCheckoutModule instance = new WebCheckoutModule();

  private WebCheckoutModule() {
  }

  public static WebCheckoutModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CheckoutStep.class).to(WebCheckoutStep.class);
  }
}
