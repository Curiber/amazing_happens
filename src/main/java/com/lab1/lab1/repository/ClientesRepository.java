package com.lab1.lab1.repository;

import com.lab1.lab1.model.Clientes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientesRepository extends MongoRepository<Clientes, String> {


    Clientes findByRut(int rut); //encuentra cliente por rut

    Clientes findByName(String name); // encuentra cliente por nombre

}