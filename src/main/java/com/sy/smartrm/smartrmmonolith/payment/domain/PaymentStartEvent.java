package com.sy.smartrm.smartrmmonolith.payment.domain;

import com.sy.smartrm.smartrmmonolith.infracore.event.DomainEvent;

/**
 * @author: yoda
 * @description:
 */
public class PaymentStartEvent extends DomainEvent {

  private Long paymentId;
  private Long orderId;
  private Long time;

  public PaymentStartEvent(Payment payment) {
    super("payment.PaymentStartEvent");
    this.paymentId = payment.getPaymentId();
    this.orderId = payment.getOrder().getOrderId();
    this.time = System.currentTimeMillis();
  }

  @Override
  public String key() {
    return paymentId.toString();
  }
}
