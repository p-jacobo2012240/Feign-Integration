package com.hackobo.account.management.infrastructure.controllers;

import com.hackobo.account.management.domain.AccountDtoDomain;
import com.hackobo.account.management.infrastructure.mappers.AccountDtoMapper;
import com.hackobo.account.management.infrastructure.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("/list")
    public ResponseEntity<List<AccountDtoDomain>> accountList() {
        List<AccountDtoDomain> accounts = accountService.accountList();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
}
