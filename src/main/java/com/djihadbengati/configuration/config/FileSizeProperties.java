package com.djihadbengati.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Configuration
@ConfigurationProperties(prefix = "data")
public class FileSizeProperties {

  private DataSize dataSize;
  private DataSize dataSizeGB;

  @DataSizeUnit(DataUnit.TERABYTES)
  private DataSize dataSizeTB;

  public DataSize getDataSize() {
    return dataSize;
  }

  public FileSizeProperties setDataSize(DataSize dataSize) {
    this.dataSize = dataSize;
    return this;
  }

  public DataSize getDataSizeGB() {
    return dataSizeGB;
  }

  public FileSizeProperties setDataSizeGB(DataSize dataSizeGB) {
    this.dataSizeGB = dataSizeGB;
    return this;
  }

  public DataSize getDataSizeTB() {
    return dataSizeTB;
  }

  public FileSizeProperties setDataSizeTB(DataSize dataSizeTB) {
    this.dataSizeTB = dataSizeTB;
    return this;
  }
}
