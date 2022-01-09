package com.hck.client_microservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.hck.client_microservice.repository")
public class RepositoryConfiguration {
}
