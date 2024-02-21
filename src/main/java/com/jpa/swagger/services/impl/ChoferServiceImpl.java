package com.jpa.swagger.services.impl;

import com.jpa.swagger.entities.Chofer;
import com.jpa.swagger.interfaces.ChoferRepository;
import com.jpa.swagger.services.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChoferServiceImpl implements ChoferService {
    @Autowired
    ChoferRepository choferRepository;


    @Override
    public Optional<Chofer> findById(Long id) {
        return choferRepository.findById(id);
    }

    @Override
    public List<Chofer> findAll() {
        return choferRepository.findAll();
    }
}
