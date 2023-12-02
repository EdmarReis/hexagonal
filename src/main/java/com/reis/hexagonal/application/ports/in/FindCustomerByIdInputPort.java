package com.reis.hexagonal.application.ports.in;

import com.reis.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
