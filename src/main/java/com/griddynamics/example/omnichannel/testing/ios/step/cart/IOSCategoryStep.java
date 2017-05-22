package com.griddynamics.example.omnichannel.testing.ios.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.ios.screen.CategoryScreen;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.utility.UiElement;

public class IOSCategoryStep implements CategoryStep {

  private final CategoryScreen categoryScreen;

  @Inject
  public IOSCategoryStep(CategoryScreen categoryScreen) {
    this.categoryScreen = categoryScreen;
  }

  public void getProduct(String product) {
    for (UiElement uiElement : categoryScreen.getProducts()) {
      if (uiElement.getText().equals(product)) {
        uiElement.click();
      }
    }
  }
}
