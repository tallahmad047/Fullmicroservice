package com.tall.ecommerce.controller.response;

import com.tall.ecommerce.customer.Address;

public record CustomerResponse(String id,
                               String firstname,
                               String lastname,
                               String email,
                               Address address) {
}
