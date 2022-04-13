package com.hackobo.client.management.infrastructure.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="client_type")
public class ClientType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_type_id")
    private Integer clientTypeId;

    @Column(name = "client_type_name")
    private String clientTypeName;
}
