package com.jpa.swagger.services;

import com.jpa.swagger.entities.Carro;

import java.util.List;

public interface CarroService {
    List<Carro> findAll();

    Carro save(Carro carro);
}
