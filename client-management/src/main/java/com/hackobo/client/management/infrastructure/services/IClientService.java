package com.hackobo.client.management.infrastructure.services;

import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.domain.ClientDtoDomain;
import com.hackobo.client.management.domain.ClientTypeDtoDomain;
import com.hackobo.client.management.infrastructure.proxies.external.Account;

import java.util.List;

public interface IClientService {

    List<AddressDtoDomain> listAddresses();

    AddressDtoDomain addAddress(AddressDtoDomain creator);

    void deleteAddress(int addressId);

    List<ClientTypeDtoDomain> clientTypeList();

    ClientTypeDtoDomain addClientType(ClientTypeDtoDomain creator);

    // add filters = [name, type]
    List<ClientDtoDomain> clientList();

    //TEMP = this method is a simple test way
    List<Account> accounts();

}
