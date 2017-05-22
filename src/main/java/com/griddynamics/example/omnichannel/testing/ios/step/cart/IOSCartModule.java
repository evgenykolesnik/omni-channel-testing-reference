package com.griddynamics.example.omnichannel.testing.ios.step.cart;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;

public class IOSCartModule extends AbstractModule {

  private static final IOSCartModule instance = new IOSCartModule();

  private IOSCartModule() {
  }

  public static IOSCartModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CategoryStep.class).to(IOSCategoryStep.class);
    bind(ProductStep.class).to(IOSProductStep.class);
  }
}
