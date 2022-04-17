package com.hackobo.account.management.infrastructure.mappers;

import com.hackobo.account.management.domain.AccountDtoDomain;
import com.hackobo.account.management.infrastructure.entities.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountDtoMapper {

    @Mapping(source = "accountId", target = "id")
    AccountDtoDomain toDomain(Account entity);

    @Mapping(source = "id", target = "accountId")
    Account toEntity(AccountDtoDomain dto);
}
