package com.hck.client_microservice.controllers;

import com.hck.client_microservice.proxy.FeignAccountProxy;
import com.hck.client_microservice.proxy.external.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private FeignAccountProxy feignAccountProxy;

    @GetMapping
    public List<Account> allAccount() {
        return feignAccountProxy.allAccount();
    }

}
