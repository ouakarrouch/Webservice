package com.example.ProjetWebService;

import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

import ma.classes.Compte;
import ma.classes.TypeCompte;
import ma.repository.CompteRepository;



@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "ma.repository", "ma.classes"}) 
@EntityScan("ma.classes") 
@EnableJpaRepositories("ma.repository")
public class ProjetWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetWebServiceApplication.class, args);
	}
	

}