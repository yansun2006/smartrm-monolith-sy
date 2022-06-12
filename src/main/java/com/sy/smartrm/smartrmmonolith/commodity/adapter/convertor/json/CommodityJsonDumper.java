package com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.json;

import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.CommodityDumper;
import com.sy.smartrm.smartrmmonolith.commodity.adapter.convertor.JsonPropertyConvertor;

import java.io.OutputStream;

/**
 * @author: yoda
 * @description:
 */
public class CommodityJsonDumper extends CommodityDumper {

  public CommodityJsonDumper(OutputStream ostream) {
    super(new JsonPropertyConvertor(), ostream);
  }

}
