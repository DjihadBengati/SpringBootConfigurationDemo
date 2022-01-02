package com.djihadbengati.configuration.pojo;

import java.util.StringJoiner;

public class Phone {

  private String brand;
  private String color;

  public String getBrand() {
    return brand;
  }

  public Phone setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public String getColor() {
    return color;
  }

  public Phone setColor(String color) {
    this.color = color;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
        .add("brand='" + brand + "'")
        .add("color='" + color + "'")
        .toString();
  }
}
