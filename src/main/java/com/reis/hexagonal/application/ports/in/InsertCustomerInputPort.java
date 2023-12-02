package com.reis.hexagonal.application.ports.in;

import com.reis.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
