package com.lab1.lab1.service;

import com.lab1.lab1.model.Clientes;

import java.util.List;

public interface ClientesService {

        List<Clientes> findAll();

        Clientes findByRut(int rut);

        Clientes findByName(String name);

        void ingresarClientes(Clientes clientes);

        void actualizarClientes(Clientes clientes);

        void borrarClientes(String id);

    }

