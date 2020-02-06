package com.lab1.lab1.service.impl;

import com.lab1.lab1.model.Clientes;
import com.lab1.lab1.repository.ClientesRepository;
import com.lab1.lab1.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientesServiceImpl implements ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    //listado de clientes
    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes findByRut(int rut) {
        return clientesRepository.findByRut(rut);
    }

    @Override
    public Clientes findByName(String name) {
        return clientesRepository.findByName(name);
    }

    @Override
    //guarda clientes
    public void ingresarClientes(Clientes clientes) {
        clientesRepository.save(clientes);

    }

    @Override
    public void actualizarClientes(Clientes clientes) {
        clientesRepository.save(clientes);

    }

    @Override
    //borra clientes
    public void borrarClientes(String id) {
        clientesRepository.deleteById(id);
    }
}
