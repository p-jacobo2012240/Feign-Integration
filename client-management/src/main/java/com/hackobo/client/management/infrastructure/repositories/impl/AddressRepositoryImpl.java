package com.hackobo.client.management.infrastructure.repositories.impl;

import com.hackobo.client.management.application.repositories.IAddressRepository;
import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.infrastructure.mappers.AddressMapperDto;
import com.hackobo.client.management.infrastructure.repositories.SpringDataAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class AddressRepositoryImpl implements IAddressRepository {

    @Autowired
    private SpringDataAddressRepository addressRepository;

    @Autowired
    private AddressMapperDto mapper;

    @Override
    public <S extends AddressDtoDomain> S save(S s) {
        return (S) mapper.toDomain(addressRepository.save(mapper.toEntity(s)));
    }

    @Override
    public Optional<AddressDtoDomain> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<AddressDtoDomain> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<AddressDtoDomain> listAddresses() {
        return addressRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
