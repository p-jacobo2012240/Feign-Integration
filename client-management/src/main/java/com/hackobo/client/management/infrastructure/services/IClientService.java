package com.hackobo.client.management.infrastructure.services;

import com.hackobo.client.management.domain.AddressCreatorDtoDomain;
import com.hackobo.client.management.domain.AddressDtoDomain;

import java.util.List;

public interface IClientService {

    List<AddressDtoDomain> listAddresses();

    AddressDtoDomain addAddress(AddressDtoDomain creator);



}
