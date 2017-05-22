package com.griddynamics.example.omnichannel.testing.ios.step.checkout.applepay;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.ios.screen.CheckoutScreen;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;

public class IOSApplePayCheckoutStep implements CheckoutStep {

  private final CheckoutScreen checkoutScreen;

  @Inject
  public IOSApplePayCheckoutStep(CheckoutScreen checkoutScreen) {
    this.checkoutScreen = checkoutScreen;
  }

  public void applyOffer(String offer) {
    checkoutScreen.getAddressField().sendKeys(offer);
    checkoutScreen.getApplyOfferButton().click();
  }

  public void specifyBillingAddress(String address) {
    checkoutScreen.getApplyOfferButton().sendKeys(address);
  }

  public void specifyCreditCard(String cardNumber, String expires, String code) {
    checkoutScreen.getCreditCardField().sendKeys(cardNumber);
    checkoutScreen.getCreditCardField().sendKeys(expires);
    checkoutScreen.getCreditCardField().sendKeys(code);
  }

  public void checkout() {
    checkoutScreen.getCheckoutButton().click();
  }
}
