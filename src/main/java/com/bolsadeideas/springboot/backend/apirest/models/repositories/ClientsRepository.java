package com.bolsadeideas.springboot.backend.apirest.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Client;

public interface ClientsRepository extends JpaRepository<Client, Long>{
}