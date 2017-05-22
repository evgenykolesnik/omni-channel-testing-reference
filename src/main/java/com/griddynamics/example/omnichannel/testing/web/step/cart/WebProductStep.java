package com.griddynamics.example.omnichannel.testing.web.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;
import com.griddynamics.example.omnichannel.testing.web.page.ProductPage;

public class WebProductStep implements ProductStep {

  private final ProductPage productPage;

  @Inject
  public WebProductStep(ProductPage productPage) {
    this.productPage = productPage;
  }

  public void addProduct() {
    productPage.getAddButton().click();
  }
}
