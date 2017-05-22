package com.griddynamics.example.omnichannel.testing.web.page;

import com.griddynamics.example.omnichannel.testing.utility.WebElement;

public class CheckoutPage {

  private final WebElement offerField;
  private final WebElement applyOfferButton;
  private final WebElement addressField;
  private final WebElement creditCardField;
  private final WebElement checkoutButton;

  public CheckoutPage() {
    offerField = new WebElement("Offer field");
    applyOfferButton = new WebElement("Apply offer button");
    addressField = new WebElement("Address field");
    creditCardField = new WebElement("Credit card field");
    checkoutButton = new WebElement("Checkout button");
  }

  public WebElement getOfferField() {
    return offerField;
  }

  public WebElement getApplyOfferButton() {
    return applyOfferButton;
  }

  public WebElement getAddressField() {
    return addressField;
  }

  public WebElement getCreditCardField() {
    return creditCardField;
  }

  public WebElement getCheckoutButton() {
    return checkoutButton;
  }
}
