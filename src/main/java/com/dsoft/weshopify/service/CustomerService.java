package com.dsoft.weshopify.service;

import com.dsoft.weshopify.dtos.CustomerDTO;
import com.dsoft.weshopify.entites.Customer;

import java.util.List;

public interface CustomerService {


    Customer saveCustomer(CustomerDTO customerDTO);


    List<Customer> getAllCustomers();
}
