package com.example.account_microservice.controllers;

import com.example.account_microservice.entities.Account;
import com.example.account_microservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/account")
    public List<Account> allAccount() {
        return accountRepository.findAll();
    }


}
