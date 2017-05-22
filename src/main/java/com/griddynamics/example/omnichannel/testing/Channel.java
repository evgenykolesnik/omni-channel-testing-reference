package com.griddynamics.example.omnichannel.testing;

import com.google.inject.Module;
import com.griddynamics.example.omnichannel.testing.api.HttpClientModule;
import com.griddynamics.example.omnichannel.testing.api.step.auth.ApiAuthModule;
import com.griddynamics.example.omnichannel.testing.api.step.cart.ApiCartModule;
import com.griddynamics.example.omnichannel.testing.api.step.checkout.ApiCheckoutModule;
import com.griddynamics.example.omnichannel.testing.ios.step.auth.IOSAuthModule;
import com.griddynamics.example.omnichannel.testing.ios.step.cart.IOSCartModule;
import com.griddynamics.example.omnichannel.testing.ios.step.checkout.applepay.IOSApplePayCheckoutModule;
import com.griddynamics.example.omnichannel.testing.ios.step.checkout.base.IOSCheckoutModule;
import com.griddynamics.example.omnichannel.testing.web.step.auth.WebAuthModule;
import com.griddynamics.example.omnichannel.testing.web.step.cart.WebCartModule;
import com.griddynamics.example.omnichannel.testing.web.step.checkout.WebCheckoutModule;

public enum Channel {
  API(ApiAuthModule.getInstance(),
      ApiCartModule.getInstance(),
      ApiCheckoutModule.getInstance(),
      HttpClientModule.getInstance()),

  WEB(WebAuthModule.getInstance(),
      WebCartModule.getInstance(),
      WebCheckoutModule.getInstance()),

  IOS(IOSAuthModule.getInstance(),
      IOSCartModule.getInstance(),
      IOSCheckoutModule.getInstance()),

  IOS_APPLE_PAY(
      IOSAuthModule.getInstance(),
      IOSCartModule.getInstance(),
      IOSApplePayCheckoutModule.getInstance()),

  MIXED(WebAuthModule.getInstance(),
      ApiCartModule.getInstance(),
      WebCheckoutModule.getInstance(),
      HttpClientModule.getInstance());

  private final Module[] modules;

  Channel(Module... modules) {
    this.modules = modules;
  }

  public Module[] getModules() {
    return modules;
  }
}
