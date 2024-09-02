package com.dsoft.weshopify.service;

import com.dsoft.weshopify.dtos.CustomerDTO;
import com.dsoft.weshopify.entites.Customer;

public interface CustomerService {


    Customer saveCustomer(CustomerDTO customerDTO);
}
