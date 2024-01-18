package com.arantesleal.Livraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.arantesleal.Livraria.entities"})
@EnableJpaRepositories(basePackages = {"com.arantesleal.Livraria.repositories"})
@ComponentScan(basePackages = {"com.arantesleal.Livraria.controllers"})
public class LivrariaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LivrariaApplication.class, args);
    }
}