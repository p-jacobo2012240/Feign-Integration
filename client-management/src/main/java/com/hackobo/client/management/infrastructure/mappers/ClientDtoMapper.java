package com.hackobo.client.management.infrastructure.mappers;

import com.hackobo.client.management.domain.ClientDtoDomain;
import com.hackobo.client.management.infrastructure.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        uses = { AddressMapperDto.class, ClientTypeDtoMapper.class  }
)
public interface ClientDtoMapper {

    @Mapping(source = "clientId", target = "id")
    @Mapping(source = "clientName", target = "name")
    @Mapping(source = "clientLastName", target = "lastname")
    ClientDtoDomain toDomain(Client entity);

    @Mapping(source = "id", target = "clientId")
    @Mapping(source = "name", target = "clientName")
    @Mapping(source = "lastname", target = "clientLastName")
    Client toEntity(ClientDtoDomain dto);
}
