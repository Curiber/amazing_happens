package com.lab1.lab1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Clientes") //crea collection clientes
//getters and setters standards
public class Clientes {
    @Id
    private String id;
    private String name;
    private int rut;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int Rut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }


}
