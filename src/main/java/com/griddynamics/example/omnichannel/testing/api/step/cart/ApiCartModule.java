package com.griddynamics.example.omnichannel.testing.api.step.cart;

import com.google.inject.AbstractModule;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;

public class ApiCartModule extends AbstractModule {

  private static final ApiCartModule instance = new ApiCartModule();

  private ApiCartModule() {
  }

  public static ApiCartModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {
    bind(CategoryStep.class).to(ApiCategoryStep.class);
    bind(ProductStep.class).to(ApiProductStep.class);
  }
}
