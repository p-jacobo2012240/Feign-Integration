package com.hackobo.client.management.infrastructure.mappers;

import com.hackobo.client.management.application.utils.OwnerUtil;
import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.domain.ClientTypeCreatorDtoDomain;
import com.hackobo.client.management.domain.ClientTypeDtoDomain;
import com.hackobo.client.management.infrastructure.entities.ClientType;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClientTypeDtoMapper {

    String creator = OwnerUtil.MICRO_SERVICE_UUID;

    @Mapping(source = "id", target = "clientTypeId")
    @Mapping(source = "name", target = "clientTypeName")
    ClientType toEntity(ClientTypeDtoDomain dto);

    ClientTypeDtoDomain toDomain(ClientTypeCreatorDtoDomain creator);

    @Mapping(source = "clientTypeId", target = "id")
    @Mapping(source = "clientTypeName", target = "name")
    ClientTypeDtoDomain toDomain(ClientType entity);

    @AfterMapping
    default void setMetaData(@MappingTarget ClientTypeDtoDomain dto){
        dto.setMetaData(creator.concat("-").concat(String.valueOf(System.currentTimeMillis())));
    }
}
