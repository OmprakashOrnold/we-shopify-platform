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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/customer-reg")
    public String renderSignupPage() {
        return "sign-up";
    }


    @PostMapping("/sign-up")
    public String registerCustomer(CustomerDTO customerDTO,RedirectAttributes redirectAttributes) {
        log.info( "customerDTO: {}", customerDTO );
        Customer savedCustomer = customerService.saveCustomer( customerDTO );

        if (savedCustomer != null) {
            String message = "Customer registered successfully Please login below";
            redirectAttributes.addFlashAttribute( "message", message );
            return "redirect:/login";
        }
        return "sign-up";
    }
}
