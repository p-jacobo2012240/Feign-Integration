package com.hackobo.client.management.infrastructure.services.impl;

import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.domain.ClientTypeDtoDomain;
import com.hackobo.client.management.infrastructure.repositories.impl.AddressRepositoryImpl;
import com.hackobo.client.management.infrastructure.repositories.impl.ClientTypeRepositoryImpl;
import com.hackobo.client.management.infrastructure.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private AddressRepositoryImpl addressRepository;

    @Autowired
    private ClientTypeRepositoryImpl clientTypeRepository;

    @Override
    public List<AddressDtoDomain> listAddresses() {
        return addressRepository.listAddresses();
    }

    @Override
    public AddressDtoDomain addAddress(AddressDtoDomain addressDtoDomain) {
        return addressRepository.save(addressDtoDomain);
    }

    @Override
    public void deleteAddress(int addressId) {
        addressRepository.deleteById(addressId);
    }

    @Override
    public List<ClientTypeDtoDomain> clientTypeList() {
        return clientTypeRepository.clientTypeList();
    }

    @Override
    public ClientTypeDtoDomain addClientType(ClientTypeDtoDomain clientTypeDtoDomain) {
        return clientTypeRepository.save(clientTypeDtoDomain);
    }
}
