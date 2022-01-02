package com.djihadbengati.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "team")
public class TeamProperties {

  private String name;
  private String country;

  public String getName() {
    return name;
  }

  public TeamProperties setName(String name) {
    this.name = name;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public TeamProperties setCountry(String country) {
    this.country = country;
    return this;
  }
}
