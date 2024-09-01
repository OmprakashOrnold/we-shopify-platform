package com.dsoft.weshopify.controller;

import com.dsoft.weshopify.dtos.LoginDTO;
import com.dsoft.weshopify.entites.Customer;
import com.dsoft.weshopify.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final CustomerService customerService;

    @PostMapping("/login")
    public String login(LoginDTO loginDTO) {
        log.info("LoginController.login() called with loginDTO: {}", loginDTO);

        return "dashboard";
    }
}
