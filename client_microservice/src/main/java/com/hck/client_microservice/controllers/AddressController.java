package com.hck.client_microservice.controllers;

import com.hck.client_microservice.entities.Address;
import com.hck.client_microservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class AddressController  {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public List<Address> allClients() {
        return addressRepository.findAll();
    }


}
