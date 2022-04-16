package com.hackobo.client.management.infrastructure.mappers;

import com.hackobo.client.management.domain.AddressDomain;
import com.hackobo.client.management.domain.ClientTypeDomain;
import com.hackobo.client.management.infrastructure.entities.ClientType;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Value;

@Mapper(componentModel = "spring")
public interface ClientTypeMapper {

    @Value("${spring.application.name}")
    String creator = "";

    @Mapping(source = "clientTypeId", target = "id")
    @Mapping(source = "clientTypeName", target = "name")
    ClientTypeDomain toDomain(ClientType entity);

    @Mapping(source = "name", target = "clientTypeName")
    @Mapping(source = "id", target = "clientTypeId")
    ClientType toEntity(ClientTypeDomain domain);

    @AfterMapping
    default void setMetaData(@MappingTarget AddressDomain address){
        address.setMetaData(creator.concat("-").concat(String.valueOf(System.currentTimeMillis())));
    }
}
