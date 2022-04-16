package com.hackobo.client.management.application.repositories;

import com.hackobo.client.management.domain.ClientTypeDtoDomain;

import java.util.List;

public interface IClientTypeRepository extends IBaseRepository<ClientTypeDtoDomain, Integer>  {

    List<ClientTypeDtoDomain> clientTypeList();
}
