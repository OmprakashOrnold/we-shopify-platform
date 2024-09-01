package com.dsoft.weshopify.repository;

import com.dsoft.weshopify.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CustomerRepository extends JpaRepository<Customer, Long> {
}
