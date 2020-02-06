package com.lab1.lab1.controller;

import com.lab1.lab1.model.Clientes;
import com.lab1.lab1.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @GetMapping(value = "/")
    public List<Clientes> getAllClientes() {
        return clientesService.findAll();
    }

    @GetMapping(value = "/{rut}")
    public Clientes getClientesByRut(@PathVariable("rut") int rut) {
        return clientesService.findByRut(rut);
    }

    @GetMapping(value = "/{name}")
    public Clientes getClientesByName(@PathVariable("name") String name) {
        return clientesService.findByName(name);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> ingresarClientes(@RequestBody Clientes clientes) {
        clientesService.ingresarClientes(clientes);
        return new ResponseEntity<>("Cliente añadido satisfactoriamente", HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<?>  actualizarClientes(@RequestBody Clientes clientes) {
        clientesService.actualizarClientes(clientes);
        return new ResponseEntity<>("Cliente actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{rut}")
    public void borrarClientes(@PathVariable int rut) {
        clientesService.borrarClientes(clientesService.findByRut(rut).getId());
    }

}
