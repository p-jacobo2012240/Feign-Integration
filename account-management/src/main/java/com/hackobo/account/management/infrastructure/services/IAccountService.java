package com.hackobo.account.management.infrastructure.services;

import com.hackobo.account.management.domain.AccountDtoDomain;

import java.util.List;

public interface IAccountService {

    List<AccountDtoDomain> accountList();
}
