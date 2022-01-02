package com.djihadbengati.configuration.config;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "duration")
public class TimerProperties {

  private Duration timerInDefaultUnit;
  private Duration timerInNano;

  @DurationUnit(ChronoUnit.DAYS)
  private Duration timerInDay;

  public Duration getTimerInDefaultUnit() {
    return timerInDefaultUnit;
  }

  public TimerProperties setTimerInDefaultUnit(Duration timerInDefaultUnit) {
    this.timerInDefaultUnit = timerInDefaultUnit;
    return this;
  }

  public Duration getTimerInNano() {
    return timerInNano;
  }

  public TimerProperties setTimerInNano(Duration timeInNano) {
    this.timerInNano = timeInNano;
    return this;
  }

  public Duration getTimerInDay() {
    return timerInDay;
  }

  public TimerProperties setTimerInDay(Duration timerInDay) {
    this.timerInDay = timerInDay;
    return this;
  }
}
