package com.griddynamics.example.omnichannel.testing.web.step.cart;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;

public class WebCartModule extends AbstractModule {

  private static final WebCartModule instance = new WebCartModule();

  private WebCartModule() {
  }

  public static WebCartModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CategoryStep.class).to(WebCategoryStep.class);
    bind(ProductStep.class).to(WebProductStep.class);
  }
}
