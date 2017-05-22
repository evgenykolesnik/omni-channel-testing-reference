package com.griddynamics.example.omnichannel.testing.step.checkout;

public interface CheckoutStep {

  void applyOffer(String offer);

  void specifyBillingAddress(String address);

  void specifyCreditCard(String cardNumber, String expires, String code);

  void checkout();
}
