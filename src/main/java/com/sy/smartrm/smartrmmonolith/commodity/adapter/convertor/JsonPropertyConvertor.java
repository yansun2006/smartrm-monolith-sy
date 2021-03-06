package com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor;

import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.CURRENCY;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.DATE;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.DATETIME;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.FLOAT;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.IMAGE_URL;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.INTEGER;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.MAP;
import static com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode.STRING;

import com.google.common.collect.ImmutableMap;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.CurrencyPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.CurrencyPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.DatePropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.DatePropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.DateTimePropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.DateTimePropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.FloatPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.FloatPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.ImageUrlPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.ImageUrlPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.IntegerPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.IntegerPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.MapPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.MapPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.StringPropertyJsonDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json.StringPropertyJsonParser;
import com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueType;
import com.sy.smartrm.smartrmmonolith.commodity.domain.model.ValueTypeCode;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: yoda
 * @description: ??????????????????????????????Json??????
 */
@Component
public class JsonPropertyConvertor implements PropertyConvertor {

  private static Map<ValueTypeCode, Pair<CommodityPropertyParser, CommodityPropertyDumper>> adapterMap = ImmutableMap
      .<ValueTypeCode, Pair<CommodityPropertyParser, CommodityPropertyDumper>>builder()
      .put(STRING, Pair.of(new StringPropertyJsonParser(), new StringPropertyJsonDumper()))
      .put(INTEGER, Pair.of(new IntegerPropertyJsonParser(), new IntegerPropertyJsonDumper()))
      .put(FLOAT, Pair.of(new FloatPropertyJsonParser(), new FloatPropertyJsonDumper()))
      .put(CURRENCY, Pair.of(new CurrencyPropertyJsonParser(), new CurrencyPropertyJsonDumper()))
      .put(DATE, Pair.of(new DatePropertyJsonParser(), new DatePropertyJsonDumper()))
      .put(DATETIME, Pair.of(new DateTimePropertyJsonParser(), new DateTimePropertyJsonDumper()))
      .put(IMAGE_URL, Pair.of(new ImageUrlPropertyJsonParser(), new ImageUrlPropertyJsonDumper()))
      .put(MAP, Pair.of(new MapPropertyJsonParser(), new MapPropertyJsonDumper()))
      .build();

  @Override
  public CommodityPropertyParser parser(ValueType type) {
    return adapterMap.get(type.getType()).getLeft();
  }

  @Override
  public CommodityPropertyDumper dumper(ValueType type) {
    return adapterMap.get(type.getType()).getRight();
  }

}
