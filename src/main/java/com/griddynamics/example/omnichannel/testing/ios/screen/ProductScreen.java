package com.griddynamics.example.omnichannel.testing.ios.screen;

import com.griddynamics.example.omnichannel.testing.utility.UiElement;

public class ProductScreen {

  private final UiElement title;
  private final UiElement addButton;

  public ProductScreen() {
    title = new UiElement("Product title");
    addButton = new UiElement("Add product button");
  }

  public UiElement getTitle() {
    return title;
  }

  public UiElement getAddButton() {
    return addButton;
  }
}
