package com.hackobo.client.management.domain;

import com.hackobo.client.management.infrastructure.entities.Address;
import com.hackobo.client.management.infrastructure.entities.ClientType;
import lombok.Data;

@Data
public class ClientDtoDomain {

    private Integer id;

    private String name;

    private String lastname;

    private String email;

    private Integer age;

    private Boolean status;

    private Address address;

    private ClientType clientType;
}
