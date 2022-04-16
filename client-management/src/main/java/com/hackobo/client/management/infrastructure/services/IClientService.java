package com.hackobo.client.management.infrastructure.services;

import com.hackobo.client.management.domain.AddressCreatorDomain;
import com.hackobo.client.management.domain.AddressDomain;

import java.util.List;

public interface IClientService {

    List<AddressDomain>  listAddresses();

    AddressDomain addAddress(AddressCreatorDomain creator);



}
