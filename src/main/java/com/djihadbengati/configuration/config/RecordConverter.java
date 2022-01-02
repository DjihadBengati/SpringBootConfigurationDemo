package com.djihadbengati.configuration.config;

import com.djihadbengati.configuration.pojo.Record;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class RecordConverter implements Converter<String, Record> {

  @Override
  public Record convert(String from) {
    String[] data = from.split(",");
    return new Record(data[0], Double.parseDouble(data[1]));
  }

  @Override
  public JavaType getInputType(TypeFactory typeFactory) {
    return null;
  }

  @Override
  public JavaType getOutputType(TypeFactory typeFactory) {
    return null;
  }
}
