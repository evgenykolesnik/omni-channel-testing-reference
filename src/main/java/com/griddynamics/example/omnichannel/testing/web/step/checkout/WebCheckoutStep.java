package com.griddynamics.example.omnichannel.testing.web.step.checkout;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;
import com.griddynamics.example.omnichannel.testing.web.page.CheckoutPage;

public class WebCheckoutStep implements CheckoutStep {

  private final CheckoutPage checkoutPage;

  @Inject
  public WebCheckoutStep(CheckoutPage checkoutPage) {
    this.checkoutPage = checkoutPage;
  }

  public void applyOffer(String offer) {
    checkoutPage.getAddressField().sendKeys(offer);
    checkoutPage.getApplyOfferButton().click();
  }

  public void specifyBillingAddress(String address) {
    checkoutPage.getApplyOfferButton().sendKeys(address);
  }

  public void specifyCreditCard(String cardNumber, String expires, String code) {
    checkoutPage.getCreditCardField().sendKeys(cardNumber);
    checkoutPage.getCreditCardField().sendKeys(expires);
    checkoutPage.getCreditCardField().sendKeys(code);
  }

  public void checkout() {
    checkoutPage.getCheckoutButton().click();
  }
}
