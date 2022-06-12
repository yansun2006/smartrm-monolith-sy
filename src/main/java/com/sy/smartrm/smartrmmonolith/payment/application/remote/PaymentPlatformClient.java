package com.sy.smartrm.smartrmmonolith.payment.application.remote;

import com.sy.smartrm.smartrmmonolith.payment.application.dto.PaymentQrCodeDto;
import com.sy.smartrm.smartrmmonolith.payment.domain.Payment;

/**
 * @author: yoda
 * @description:
 */
public interface PaymentPlatformClient {

  PaymentQrCodeDto queryQrCode(Payment payment);

  void requestForDeduction(Payment payment);

  void requestForRefund(Payment payment);

}
