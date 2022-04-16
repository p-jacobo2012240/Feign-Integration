package com.hackobo.client.management.application.repositories;

import com.hackobo.client.management.domain.AddressDtoDomain;

import java.util.List;

public interface IAddressRepository extends IBaseRepository<AddressDtoDomain, Integer> {

    List<AddressDtoDomain> listAddresses();
}
