package com.reis.hexagonal.application.ports.out;

import com.reis.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);

}
