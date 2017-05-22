package com.griddynamics.example.omnichannel.testing.utility;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.griddynamics.example.omnichannel.testing.Channel;
import org.junit.rules.ExternalResource;

public class InjectableResource extends ExternalResource {

  private final Injector injector;

  private final Object object;

  public InjectableResource(Object object, Channel channel) {
    this.object = object;
    this.injector = Guice.createInjector(channel.getModules());
  }

  @Override
  protected void before() throws Throwable {
    injector.injectMembers(object);
  }
}
