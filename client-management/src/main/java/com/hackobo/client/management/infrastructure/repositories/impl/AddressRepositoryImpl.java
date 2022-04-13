package com.hackobo.client.management.infrastructure.repositories.impl;

import com.hackobo.client.management.application.repositories.repositories.AddressRepository;
import com.hackobo.client.management.domain.AddressDomain;

import java.util.Optional;

public class AddressRepositoryImpl implements AddressRepository  {

    @Override
    public <S extends AddressDomain> S save(S s) {
        return null;
    }

    @Override
    public Optional<AddressDomain> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<AddressDomain> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
