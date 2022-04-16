package com.hackobo.client.management.application.repositories;

import com.hackobo.client.management.domain.ClientDtoDomain;

import java.util.List;

public interface IClientRepository extends IBaseRepository<ClientDtoDomain, Integer> {

    List<ClientDtoDomain> clientList();
}
