package com.tall.order.kafka;

import com.tall.order.customer.CustomerResponse;
import com.tall.order.oder.PaymentMethod;
import com.tall.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
