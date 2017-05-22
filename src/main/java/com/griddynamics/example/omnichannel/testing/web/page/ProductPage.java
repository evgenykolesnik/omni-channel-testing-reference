package com.griddynamics.example.omnichannel.testing.web.page;

import com.griddynamics.example.omnichannel.testing.utility.WebElement;

public class ProductPage {

  private final WebElement title;
  private final WebElement addButton;

  public ProductPage() {
    title = new WebElement("Product title");
    addButton = new WebElement("Add product button");
  }

  public WebElement getTitle() {
    return title;
  }

  public WebElement getAddButton() {
    return addButton;
  }
}
