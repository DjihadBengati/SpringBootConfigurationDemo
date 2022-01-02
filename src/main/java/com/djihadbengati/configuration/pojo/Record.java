package com.djihadbengati.configuration.pojo;

import java.util.StringJoiner;
import javax.validation.constraints.Positive;

public class Record {

  private String sport;

  @Positive
  private double time;

  public Record(String sport, @Positive double time) {
    this.sport = sport;
    this.time = time;
  }

  public String getSport() {
    return sport;
  }

  public Record setSport(String sport) {
    this.sport = sport;
    return this;
  }

  public double getTime() {
    return time;
  }

  public Record setTime(double time) {
    this.time = time;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Record.class.getSimpleName() + "[", "]")
        .add("sport='" + sport + "'")
        .add("time=" + time)
        .toString();
  }
}
