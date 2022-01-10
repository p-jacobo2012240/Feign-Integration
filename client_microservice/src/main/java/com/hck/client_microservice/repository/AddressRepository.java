package com.hck.client_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hck.client_microservice.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
