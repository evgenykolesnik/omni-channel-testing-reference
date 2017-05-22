package com.griddynamics.example.omnichannel.testing;

import com.google.inject.Inject;
import com.griddynamics.example.omnichannel.testing.step.auth.LoginStep;
import com.griddynamics.example.omnichannel.testing.step.cart.CategoryStep;
import com.griddynamics.example.omnichannel.testing.step.cart.ProductStep;
import com.griddynamics.example.omnichannel.testing.step.checkout.CheckoutStep;
import com.griddynamics.example.omnichannel.testing.utility.InjectableResource;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class CheckoutTest {

  @Rule
  public ExternalResource steps =
      new InjectableResource(this, Channel.valueOf(System.getProperty("channel")));

  @Inject
  private CategoryStep categoryStep;

  @Inject
  private CheckoutStep checkoutStep;

  @Inject
  private LoginStep loginStep;

  @Inject
  private ProductStep productStep;

  @Test
  public void anonymousUserCheckout() {
    categoryStep.getProduct("shoes");
    productStep.addProduct();
    checkoutStep.applyOffer("BUY1GET1FREE");
    checkoutStep.specifyBillingAddress("Some real address");
    checkoutStep.specifyCreditCard("4111-1111-1111-1111", "12/20", "123");
    checkoutStep.checkout();
  }

  @Test
  public void authUserCheckout() {
    loginStep.login("omnichannel@mail.ru", "ASDqwe!23");
    categoryStep.getProduct("jeans");
    productStep.addProduct();
    checkoutStep.applyOffer("10PERCENTOFF");
    checkoutStep.specifyBillingAddress("Another real address");
    checkoutStep.specifyCreditCard("5111-1111-1111-1111", "01/20", "234");
    checkoutStep.checkout();
  }
}
