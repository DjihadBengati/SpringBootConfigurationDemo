package com.djihadbengati.configuration.config;

import javax.validation.constraints.Pattern;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "validation")
public class ValidationProperties {

  @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
  private String email;

  public String getEmail() {
    return email;
  }

  public ValidationProperties setEmail(String email) {
    this.email = email;
    return this;
  }
}
