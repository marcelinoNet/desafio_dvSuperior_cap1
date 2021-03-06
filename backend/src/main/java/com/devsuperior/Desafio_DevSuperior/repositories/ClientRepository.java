package com.devsuperior.Desafio_DevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.Desafio_DevSuperior.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
