package com.hackobo.client.management.infrastructure.repositories;


import com.hackobo.client.management.infrastructure.entities.ClientType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataClientTypeRepository extends JpaRepository<ClientType, Integer> {

}
