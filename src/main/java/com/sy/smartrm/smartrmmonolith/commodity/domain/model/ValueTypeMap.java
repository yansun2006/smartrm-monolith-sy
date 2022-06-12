package com.sy.smartrm.smartrmmonolith.commodity.domain.model;

import java.util.Map;

public class ValueTypeMap implements ValueType<Map> {

  @Override
  public ValueTypeCode getType() {
    return ValueTypeCode.MAP;
  }

  @Override
  public Class<Map> getValueClass() {
    return Map.class;
  }

}
