package com.hackobo.account.management.infrastructure.repositories.impl;

import com.hackobo.account.management.application.repositories.IAccountRepository;
import com.hackobo.account.management.domain.AccountDtoDomain;
import com.hackobo.account.management.infrastructure.repositories.SpringDataAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountRepositoryImpl implements IAccountRepository {

    @Autowired
    private SpringDataAccountRepository accountRepository;

    @Override
    public <S extends AccountDtoDomain> S save(S s) {
        return null;
    }

    @Override
    public Optional<AccountDtoDomain> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<AccountDtoDomain> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<AccountDtoDomain> listAccount() {
        return null;
    }
}
