package com.griddynamics.example.omnichannel.testing.api.step.cart;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class ApiCategoryStep implements CategoryStep {

  private final HttpClient httpClient;

  @Inject
  public ApiCategoryStep(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public void getProduct(String product) {
    httpClient.doGet("product/" + product);
  }
}
