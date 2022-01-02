package com.djihadbengati.configuration.config;

import com.djihadbengati.configuration.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("sport")
public class SportRecordProperties {

  @Autowired
  private RecordConverter converter;

  private Record record;

  public Record getRecord() {
    return record;
  }

  public SportRecordProperties setRecord(String record) {
    this.record = converter.convert(record);
    return this;
  }
}
