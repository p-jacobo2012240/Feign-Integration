package com.hackobo.account.management;

import com.hackobo.account.management.infrastructure.services.IAccountService;
import com.hackobo.account.management.infrastructure.services.impl.AccountServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hackobo.account.management.infrastructure.repositories")
public class AccountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountManagementApplication.class, args);
    }

    @Bean
    public IAccountService accountService() {
        return new AccountServiceImpl();
    }
}
