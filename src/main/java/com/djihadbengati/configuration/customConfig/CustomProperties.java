package com.djihadbengati.configuration.customConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class CustomProperties {

  private String color;

  public String getColor() {
    return color;
  }

  public CustomProperties setColor(String color) {
    this.color = color;
    return this;
  }
}
