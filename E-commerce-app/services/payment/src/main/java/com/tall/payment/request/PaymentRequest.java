package com.tall.payment.request;

import com.tall.payment.entities.Customer;
import com.tall.payment.entities.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(Integer id,
                             BigDecimal amount,
                             PaymentMethod paymentMethod,
                             Integer orderId,
                             String orderReference,
                             Customer customer) {
}
