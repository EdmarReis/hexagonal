package com.reis.hexagonal.config;

import com.reis.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.reis.hexagonal.adapters.out.InsertCustomerAdapter;
import com.reis.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.reis.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
