package com.hackobo.account.management.infrastructure.services.impl;

import com.hackobo.account.management.domain.AccountDtoDomain;
import com.hackobo.account.management.infrastructure.repositories.impl.AccountRepositoryImpl;
import com.hackobo.account.management.infrastructure.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountRepositoryImpl accountRepository;

    @Override
    public List<AccountDtoDomain> accountList() {
        return accountRepository.listAccount();
    }
}
