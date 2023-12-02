package com.reis.hexagonal.adapters.out.client.mapper;

import com.reis.hexagonal.adapters.out.client.response.AddressResponse;
import com.reis.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
