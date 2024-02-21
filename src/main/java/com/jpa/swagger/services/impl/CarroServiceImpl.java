package com.jpa.swagger.services.impl;

import com.jpa.swagger.entities.Carro;
import com.jpa.swagger.interfaces.CarroRepository;
import com.jpa.swagger.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    CarroRepository carroRepository;
    @Override
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    @Override
    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }
}
