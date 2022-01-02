package com.djihadbengati.configuration;

import static java.lang.String.format;
import static java.lang.String.join;

import com.djihadbengati.configuration.config.CredentialsProperties;
import com.djihadbengati.configuration.config.FileSizeProperties;
import com.djihadbengati.configuration.config.MailProperties;
import com.djihadbengati.configuration.config.PhoneProperties;
import com.djihadbengati.configuration.config.SportRecordProperties;
import com.djihadbengati.configuration.config.TeamProperties;
import com.djihadbengati.configuration.config.TimerProperties;
import com.djihadbengati.configuration.config.UserProperties;
import com.djihadbengati.configuration.config.ValidationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties(TeamProperties.class)
// To look for properties class only inside this package
// @ConfigurationPropertiesScan("com.djihadbengati.configuration.customConfig")
// @ConfigurationPropertiesScan("com.djihadbengati.configuration.config")
public class ConfigurationApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigurationApplication.class, args);
  }

  @Component
  static class StartupRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private MailProperties mailProperties;

    @Autowired
    private TeamProperties teamProperties;

    @Autowired
    private UserProperties userProperties;

    @Autowired
    private PhoneProperties phoneProperties;

    @Autowired
    private ValidationProperties validationProperties;

    @Autowired
    private TimerProperties timerProperties;

    @Autowired
    private FileSizeProperties fileSizeProperties;

    @Autowired
    private SportRecordProperties sportRecordProperties;

    @Autowired
    private CredentialsProperties credentialsProperties;

    @Override
    public void run(String... args) {
      logger.info(
          format("%s - hostname: %s, port: %s, from: %s", mailProperties.getClass().getSimpleName(),
              mailProperties.getHostname(),
              mailProperties.getPort(), mailProperties.getFrom()));

      logger.info(
          format("%s - name: %s, country: %s", teamProperties.getClass().getSimpleName(),
              teamProperties.getName(),
              teamProperties.getCountry()));

      logger.info(format("%s - username: %s, roles: %s, wallet: %s, credentials: %s",
          userProperties.getClass().getSimpleName(),
          userProperties.getUsername(), userProperties.getRoles(), userProperties.getWallet(),
          userProperties.getCredentials()));

      logger.info(format("%s - brand: %s, color: %s", phoneProperties.getClass().getSimpleName(),
          phoneProperties.getPhone().getBrand(), phoneProperties.getPhone().getColor()));

      logger.info(format("%s - email: %s",
          validationProperties.getClass().getSimpleName(), validationProperties.getEmail()));

      logger.info(format(
          "%s - default timer milliseconds: %s = 10 ms, timer nanoseconds: %s = 9 ns, timer days: %s = 2 days",
          timerProperties.getClass().getSimpleName(), timerProperties.getTimerInDefaultUnit(),
          timerProperties.getTimerInNano()
          , timerProperties.getTimerInDay()));

      logger.info(format("%s - dataSize: %s, dataSizeGB: %s, dataSizeTB: %s",
          fileSizeProperties.getClass().getSimpleName(),
          fileSizeProperties.getDataSize(), fileSizeProperties.getDataSizeGB(),
          fileSizeProperties.getDataSizeTB()));

      logger.info(format("%s - record: %s",
          sportRecordProperties.getClass().getSimpleName(),
          sportRecordProperties.getRecord()));

      logger.info(format("%s - credentials: %s",
          credentialsProperties.getClass().getSimpleName(),
          join("-", credentialsProperties.getEmail(), credentialsProperties.getPassword())));
    }
  }

}
