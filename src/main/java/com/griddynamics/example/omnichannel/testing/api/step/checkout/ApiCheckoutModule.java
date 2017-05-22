package com.griddynamics.example.omnichannel.testing.api.step.checkout;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;

public class ApiCheckoutModule extends AbstractModule {

  private static final ApiCheckoutModule instance = new ApiCheckoutModule();

  private ApiCheckoutModule() {
  }

  public static ApiCheckoutModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CheckoutStep.class).to(ApiCheckoutStep.class);
  }
}
