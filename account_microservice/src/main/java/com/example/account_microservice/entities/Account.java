package com.example.account_microservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer account_id;

    @Column(name = "account_name")
    private String account_name;

    @Column(name = "client_id")
    private Integer client_id;

}
