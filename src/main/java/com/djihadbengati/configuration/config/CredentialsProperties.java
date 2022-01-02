package com.djihadbengati.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user.credentials")
public class CredentialsProperties {

  private String email;
  private String password;

  public CredentialsProperties() {
  }

  public CredentialsProperties(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public CredentialsProperties setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public CredentialsProperties setPassword(String password) {
    this.password = password;
    return this;
  }
}
