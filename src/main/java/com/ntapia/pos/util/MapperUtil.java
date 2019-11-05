package com.ntapia.pos.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {

  private final ModelMapper modelMapper = new ModelMapper();

  public ModelMapper getMapper() {
    return modelMapper;
  }
}
