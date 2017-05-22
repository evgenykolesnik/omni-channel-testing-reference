package com.griddynamics.example.omnichannel.testing.web.page;

import com.griddynamics.example.omnichannel.testing.utility.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CategoryPage {

  private final List<WebElement> products;

  public CategoryPage() {
    this.products = new ArrayList<>();
  }

  public List<WebElement> getProducts() {
    return products;
  }
}
