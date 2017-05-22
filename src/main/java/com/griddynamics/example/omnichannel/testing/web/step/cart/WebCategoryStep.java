package com.griddynamics.example.omnichannel.testing.web.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.utility.WebElement;
import com.griddynamics.example.omnichannel.testing.web.page.CategoryPage;

public class WebCategoryStep implements CategoryStep {

  private final CategoryPage categoryPage;

  @Inject
  public WebCategoryStep(CategoryPage categoryPage) {
    this.categoryPage = categoryPage;
  }

  public void getProduct(String product) {
    for (WebElement webElement : categoryPage.getProducts()) {
      if (webElement.getText().equals(product)) {
        webElement.click();
      }
    }
  }
}
