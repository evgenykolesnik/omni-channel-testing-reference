package com.griddynamics.example.omnichannel.testing.api.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class ApiProductStep implements ProductStep {

  private final HttpClient httpClient;

  @Inject
  public ApiProductStep(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public void addProduct() {
    httpClient.doPost("cart", "product");
  }
}
