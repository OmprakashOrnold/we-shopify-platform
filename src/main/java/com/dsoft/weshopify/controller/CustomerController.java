package com.dsoft.weshopify.controller;

import com.dsoft.weshopify.dtos.CustomerDTO;
import com.dsoft.weshopify.entites.Customer;
import com.dsoft.weshopify.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/customer")
    public String renderSignupPage() {
        return "sign-up";
    }


    @PostMapping("/sign-up")
    public String registerCustomer(CustomerDTO customerDTO, Model model) {
        log.info("customerDTO: {}", customerDTO);
        customerService.saveCustomer(customerDTO);
        model.addAttribute( "customer" ,customerDTO);
        return "sign-up";
    }
}
