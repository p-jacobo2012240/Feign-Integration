package com.hackobo.client.management.infrastructure.services.impl;

import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.infrastructure.repositories.impl.AddressRepositoryImpl;
import com.hackobo.client.management.infrastructure.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private AddressRepositoryImpl addressRepository;

    @Override
    public List<AddressDtoDomain> listAddresses() {
        return addressRepository.listAddresses();
    }

    @Override
    public AddressDtoDomain addAddress(AddressDtoDomain addressDtoDomain) {
        return addressRepository.save(addressDtoDomain);
    }
}
