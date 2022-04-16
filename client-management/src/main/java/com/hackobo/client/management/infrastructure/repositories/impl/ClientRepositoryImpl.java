package com.hackobo.client.management.infrastructure.repositories.impl;

import com.hackobo.client.management.application.repositories.IClientRepository;
import com.hackobo.client.management.domain.ClientDtoDomain;
import com.hackobo.client.management.infrastructure.mappers.ClientDtoMapper;
import com.hackobo.client.management.infrastructure.repositories.SpringDataClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ClientRepositoryImpl implements IClientRepository {

    @Autowired
    private SpringDataClientRepository clientRepository;

    @Autowired
    private ClientDtoMapper mapper;

    @Override
    public <S extends ClientDtoDomain> S save(S s) {
        return null;
    }

    @Override
    public Optional<ClientDtoDomain> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<ClientDtoDomain> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<ClientDtoDomain> clientList() {
        return clientRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
