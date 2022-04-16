package com.hackobo.client.management.infrastructure.repositories.impl;

import com.hackobo.client.management.application.repositories.IAddressRepository;
import com.hackobo.client.management.domain.AddressDomain;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AddressRepositoryImpl implements IAddressRepository {

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
