package com.tall.order.payment;

import com.tall.order.customer.CustomerResponse;
import com.tall.order.oder.PaymentMethod;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class PaymentRequest {
    public PaymentRequest(@Positive(message = "Order amount should be positive") BigDecimal amount, @NotNull(message = "Payment method should be precised") PaymentMethod paymentMethod, Integer id, String reference, CustomerResponse customer) {
    }
}
