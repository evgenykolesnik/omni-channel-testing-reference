package com.griddynamics.example.omnichannel.testing.api;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.griddynamics.example.omnichannel.testing.utility.HttpClient;

public class HttpClientModule extends AbstractModule {

  private static final HttpClientModule instance = new HttpClientModule();

  private HttpClientModule() {
  }

  public static HttpClientModule getInstance() {
    return instance;
  }

  @Override
  protected void configure() {

  }

  @Provides
  @Singleton
  public HttpClient provideHttpClient() {
    return new HttpClient("http://localhost:8080/");
  }
}
