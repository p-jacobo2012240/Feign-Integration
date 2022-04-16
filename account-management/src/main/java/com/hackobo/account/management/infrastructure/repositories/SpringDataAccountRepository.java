package com.hackobo.account.management.infrastructure.repositories;

import com.hackobo.account.management.infrastructure.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAccountRepository extends JpaRepository<Account, Integer> {
}
