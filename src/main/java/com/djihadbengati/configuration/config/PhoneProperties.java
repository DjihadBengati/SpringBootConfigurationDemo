package com.djihadbengati.configuration.config;

import com.djihadbengati.configuration.pojo.Phone;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneProperties {

  @Bean
  @ConfigurationProperties(prefix = "phone")
  public Phone getPhone() {
    return new Phone();
  }

}
