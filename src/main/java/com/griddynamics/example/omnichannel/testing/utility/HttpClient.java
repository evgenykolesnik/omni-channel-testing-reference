package com.griddynamics.example.omnichannel.testing.utility;

import java.util.logging.Logger;

public class HttpClient {

  private static final Logger logger = Logger.getLogger(HttpClient.class.getName());

  private final String baseUrl;

  public HttpClient(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public void doGet(String url) {
    logger.info(String.format("Do http get to '%s'", baseUrl + url));
  }

  public void doPost(String url, String body) {
    logger.info(String.format("Do http post to '%s' with body '%s'", baseUrl + url, body));
  }

  public void doPut(String url, String body) {
    logger.info(String.format("Do http put to '%s' with body '%s'", baseUrl + url, body));
  }

  public void doDelete(String url) {
    logger.info(String.format("Do http delete to '%s'", baseUrl + url));
  }
}
