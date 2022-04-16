package com.hackobo.client.management.infrastructure.controllers;

import com.hackobo.client.management.domain.AddressCreatorDtoDomain;
import com.hackobo.client.management.domain.AddressDtoDomain;
import com.hackobo.client.management.infrastructure.mappers.AddressMapperDto;
import com.hackobo.client.management.infrastructure.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @Autowired
    private AddressMapperDto mapper;

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressDtoDomain>> listAddresses() {
        List<AddressDtoDomain> addresses = clientService.listAddresses();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @PostMapping("/addresses")
    public ResponseEntity<AddressDtoDomain> addAddress(@RequestBody AddressCreatorDtoDomain creator) {
        AddressDtoDomain addressDtoDomain = clientService.addAddress(mapper.toDomain(creator));
        return new ResponseEntity<>(addressDtoDomain, HttpStatus.OK);
    }

}
