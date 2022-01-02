package com.djihadbengati.configuration.pojo;

import java.util.StringJoiner;

public class Credentials {

  private String email;
  private String password;

  public String getEmail() {
    return email;
  }

  public Credentials setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public Credentials setPassword(String password) {
    this.password = password;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Credentials.class.getSimpleName() + "[", "]")
        .add("email='" + email + "'")
        .add("password='" + password + "'")
        .toString();
  }
}
