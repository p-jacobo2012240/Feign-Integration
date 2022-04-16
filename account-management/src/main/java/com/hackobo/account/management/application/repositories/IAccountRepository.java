package com.hackobo.account.management.application.repositories;

import com.hackobo.account.management.domain.AccountDtoDomain;

import java.util.List;

public interface IAccountRepository extends IBaseRepository<AccountDtoDomain, Integer>  {

    List<AccountDtoDomain> listAccount();
}
