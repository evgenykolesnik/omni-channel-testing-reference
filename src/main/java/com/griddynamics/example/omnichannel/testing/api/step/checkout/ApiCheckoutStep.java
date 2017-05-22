package com.griddynamics.example.omnichannel.testing.api.step.checkout;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class ApiCheckoutStep implements CheckoutStep {

  private final HttpClient httpClient;

  @Inject
  public ApiCheckoutStep(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public void applyOffer(String offer) {
    httpClient.doPut("order", "offer=" + offer);
  }

  public void specifyBillingAddress(String address) {
    httpClient.doPut("order", "address=" + address);
  }

  public void specifyCreditCard(String cardNumber, String expires, String code) {
    String request = String.format("card=%s,expires=%s,code=%s", cardNumber, expires, code);
    httpClient.doPut("order", request);
  }

  public void checkout() {
    httpClient.doPost("order", null);
  }
}
