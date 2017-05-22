package com.griddynamics.example.omnichannel.testing.ios.screen;

import com.griddynamics.example.omnichannel.testing.utility.UiElement;

public class CheckoutScreen {

  private final UiElement offerField;
  private final UiElement applyOfferButton;
  private final UiElement addressField;
  private final UiElement creditCardField;
  private final UiElement checkoutButton;

  public CheckoutScreen() {
    offerField = new UiElement("Offer field");
    applyOfferButton = new UiElement("Apply offer button");
    addressField = new UiElement("Address field");
    creditCardField = new UiElement("Credit card field");
    checkoutButton = new UiElement("Checkout button");
  }

  public UiElement getOfferField() {
    return offerField;
  }

  public UiElement getApplyOfferButton() {
    return applyOfferButton;
  }

  public UiElement getAddressField() {
    return addressField;
  }

  public UiElement getCreditCardField() {
    return creditCardField;
  }

  public UiElement getCheckoutButton() {
    return checkoutButton;
  }
}
