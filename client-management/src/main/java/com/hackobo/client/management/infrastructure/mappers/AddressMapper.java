package com.hackobo.client.management.infrastructure.mappers;

import com.hackobo.client.management.domain.AddressDomain;
import com.hackobo.client.management.infrastructure.entities.Address;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Value;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Value("${spring.application.name}")
    String creator = "";

    @Mapping(source = "addressId", target = "id")
    AddressDomain toDomain(Address entity);

    @Mapping(source = "id", target = "addressId")
    Address toEntity(AddressDomain domain);

    @AfterMapping
    default void setMetaData(@MappingTarget AddressDomain address){
        address.setMetaData(creator.concat("-").concat(String.valueOf(System.currentTimeMillis())));
    }



}
