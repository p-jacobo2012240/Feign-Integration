package com.hackobo.client.management.infrastructure.repositories;

import com.hackobo.client.management.infrastructure.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAddressRepository extends JpaRepository<Address, Integer> {

}
