package com.sy.smartrm.smartrmmonolith.user.application.client;

import com.sy.smartrm.smartrmmonolith.user.application.dto.WxCode2SessionResultDto;

/**
 * @author: yoda
 * @description:
 */
public interface WxPlatformClient {

  WxCode2SessionResultDto code2Session(String code);

}
