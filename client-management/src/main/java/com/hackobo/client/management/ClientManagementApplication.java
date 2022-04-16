package com.hackobo.client.management;

import com.hackobo.client.management.infrastructure.services.IClientService;
import com.hackobo.client.management.infrastructure.services.impl.ClientServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hackobo.client.management.infrastructure.repositories")
public class ClientManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientManagementApplication.class, args);
    }

    @Bean
    public IClientService clientService() {
        return new ClientServiceImpl();
    }

}
