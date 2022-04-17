package com.hackobo.account.management.infrastructure.repositories.impl;

import com.hackobo.account.management.application.repositories.IAccountRepository;
import com.hackobo.account.management.domain.AccountDtoDomain;
import com.hackobo.account.management.infrastructure.mappers.AccountDtoMapper;
import com.hackobo.account.management.infrastructure.repositories.SpringDataAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class AccountRepositoryImpl implements IAccountRepository {

    @Autowired
    private SpringDataAccountRepository accountRepository;

    @Autowired
    private AccountDtoMapper mapper;

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
        return accountRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
