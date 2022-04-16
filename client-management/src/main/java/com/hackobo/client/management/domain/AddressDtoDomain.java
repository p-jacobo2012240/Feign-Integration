package com.hackobo.client.management.domain;

import lombok.Data;

@Data
public class AddressDtoDomain {

    private Integer id;

    private String country;

    private String city;

    private String metaData;
}
