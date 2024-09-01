package com.dsoft.weshopify.service;

import com.dsoft.weshopify.dtos.CustomerDTO;
import com.dsoft.weshopify.entites.Customer;
import com.dsoft.weshopify.repository.CustomerRepository;
import com.dsoft.weshopify.utils.MapperUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final MapperUtils mapperUtils;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer = mapperUtils.map( customerDTO, Customer.class );
        customerRepository.save( customer );
    }
}
