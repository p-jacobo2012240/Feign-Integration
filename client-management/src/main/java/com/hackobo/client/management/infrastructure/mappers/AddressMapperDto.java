package com.hackobo.client.management.infrastructure.mappers;

import com.hackobo.client.management.domain.AddressCreatorDtoDomain;
import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.infrastructure.entities.Address;
import com.hackobo.client.management.application.utils.OwnerUtil;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface AddressMapperDto {

    String creator = OwnerUtil.MICRO_SERVICE_UUID;

    @Mapping(source = "addressId", target = "id")
    AddressDtoDomain toDomain(Address entity);

    AddressDtoDomain toDomain(AddressCreatorDtoDomain creator);

    @Mapping(source = "id", target = "addressId")
    Address toEntity(AddressDtoDomain domain);

    @AfterMapping
    default void setMetaData(@MappingTarget AddressDtoDomain address){
        address.setMetaData(creator.concat("-").concat(String.valueOf(System.currentTimeMillis())));
    }
}
