package com.hackobo.client.management.infrastructure.repositories.impl;

import com.hackobo.client.management.application.repositories.IClientTypeRepository;
import com.hackobo.client.management.domain.ClientTypeDtoDomain;
import com.hackobo.client.management.infrastructure.mappers.ClientTypeDtoMapper;
import com.hackobo.client.management.infrastructure.repositories.SpringDataClientTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ClientTypeRepositoryImpl implements IClientTypeRepository {

    @Autowired
    private SpringDataClientTypeRepository clientTypeRepository;

    @Autowired
    private ClientTypeDtoMapper mapper;

    @Override
    public <S extends ClientTypeDtoDomain> S save(S s) {
        return (S) mapper.toDomain(clientTypeRepository.save(mapper.toEntity(s)));
    }

    @Override
    public Optional<ClientTypeDtoDomain> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<ClientTypeDtoDomain> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<ClientTypeDtoDomain> clientTypeList() {
        return clientTypeRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
