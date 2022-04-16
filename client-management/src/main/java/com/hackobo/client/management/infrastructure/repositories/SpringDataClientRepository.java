package com.hackobo.client.management.infrastructure.repositories;

import com.hackobo.client.management.infrastructure.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataClientRepository extends JpaRepository<Client, Integer> {
}
