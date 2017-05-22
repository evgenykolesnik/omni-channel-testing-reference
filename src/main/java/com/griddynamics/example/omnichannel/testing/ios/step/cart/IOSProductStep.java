package com.griddynamics.example.omnichannel.testing.ios.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.ios.screen.ProductScreen;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;

public class IOSProductStep implements ProductStep {

  private final ProductScreen productScreen;

  @Inject
  public IOSProductStep(ProductScreen productScreen) {
    this.productScreen = productScreen;
  }

  public void addProduct() {
    productScreen.getAddButton().click();
  }
}
