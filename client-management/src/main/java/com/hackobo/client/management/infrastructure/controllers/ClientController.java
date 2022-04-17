package com.hackobo.client.management.infrastructure.controllers;

import com.hackobo.client.management.domain.*;
import com.hackobo.client.management.infrastructure.mappers.AddressMapperDto;
import com.hackobo.client.management.infrastructure.mappers.ClientTypeDtoMapper;
import com.hackobo.client.management.infrastructure.proxies.external.Account;
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
    private AddressMapperDto addressDtoMapper;

    @Autowired
    private ClientTypeDtoMapper clientTypeDtoMapper;

    @GetMapping("/")
    public ResponseEntity<List<ClientDtoDomain>> clientList() {
        List<ClientDtoDomain> clients = clientService.clientList();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressDtoDomain>> listAddresses() {
        List<AddressDtoDomain> addresses = clientService.listAddresses();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @PostMapping("/addresses")
    public ResponseEntity<AddressDtoDomain> addAddress(@RequestBody AddressCreatorDtoDomain creator) {
        AddressDtoDomain addressDtoDomain = clientService.addAddress(addressDtoMapper.toDomain(creator));
        return new ResponseEntity<>(addressDtoDomain, HttpStatus.OK);
    }

    @DeleteMapping("/addresses/{addressId}")
    public ResponseEntity<?> deleteAddress(@PathVariable String addressId) {
        clientService.deleteAddress(Integer.parseInt(addressId));
        return new ResponseEntity<>("{ \"message\" : \" address deleted! \"}", HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<ClientTypeDtoDomain>> clientTypeList() {
        List<ClientTypeDtoDomain> clientTypes = clientService.clientTypeList();
        return new ResponseEntity<>(clientTypes, HttpStatus.OK);
    }

    @PostMapping("/type")
    public ResponseEntity<ClientTypeDtoDomain> addClientType(@RequestBody ClientTypeCreatorDtoDomain creator) {
        ClientTypeDtoDomain clientTypeDtoDomain = clientService.addClientType(clientTypeDtoMapper.toDomain(creator));
        return new ResponseEntity<>(clientTypeDtoDomain, HttpStatus.OK);
    }

    @GetMapping("/test-accounts")
    public ResponseEntity<List<Account>> accountList() {
        List<Account> rawAccounts = clientService.accounts();
        return new ResponseEntity<>(rawAccounts, HttpStatus.OK);
    }
}
