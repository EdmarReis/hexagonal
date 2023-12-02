package com.reis.hexagonal.adapters.out.repository.mapper;

import com.reis.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.reis.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
