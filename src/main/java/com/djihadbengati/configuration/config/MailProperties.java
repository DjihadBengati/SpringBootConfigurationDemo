package com.djihadbengati.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailProperties {

  private String hostname;
  private String port;
  private String from;

  public String getHostname() {
    return hostname;
  }

  public MailProperties setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  public String getPort() {
    return port;
  }

  public MailProperties setPort(String port) {
    this.port = port;
    return this;
  }

  public String getFrom() {
    return from;
  }

  public MailProperties setFrom(String from) {
    this.from = from;
    return this;
  }
}
