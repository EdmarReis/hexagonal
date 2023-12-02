package com.reis.hexagonal.application.ports.out;

import com.reis.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
