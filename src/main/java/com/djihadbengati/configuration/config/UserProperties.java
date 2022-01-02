package com.djihadbengati.configuration.config;

import com.djihadbengati.configuration.pojo.Credentials;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user")
public class UserProperties {

  private String username;
  private List<String> roles;
  private Map<String, Float> wallet;
  private Credentials credentials;

  public String getUsername() {
    return username;
  }

  public UserProperties setUsername(String username) {
    this.username = username;
    return this;
  }

  public List<String> getRoles() {
    return roles;
  }

  public UserProperties setRoles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Map<String, Float> getWallet() {
    return wallet;
  }

  public UserProperties setWallet(Map<String, Float> wallet) {
    this.wallet = wallet;
    return this;
  }

  public Credentials getCredentials() {
    return credentials;
  }

  public UserProperties setCredentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }
}
