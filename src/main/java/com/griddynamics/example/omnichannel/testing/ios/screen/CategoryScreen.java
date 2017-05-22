package com.griddynamics.example.omnichannel.testing.ios.screen;

import com.griddynamics.example.omnichannel.testing.utility.UiElement;
import java.util.ArrayList;
import java.util.List;

public class CategoryScreen {

  private final List<UiElement> products;

  public CategoryScreen() {
    this.products = new ArrayList<>();
  }

  public List<UiElement> getProducts() {
    return products;
  }
}
