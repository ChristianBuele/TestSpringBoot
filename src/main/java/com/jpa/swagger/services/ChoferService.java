package com.jpa.swagger.services;

import com.jpa.swagger.entities.Chofer;

import java.util.List;
import java.util.Optional;

public interface ChoferService {
    Optional<Chofer> findById(Long id);
    List<Chofer> findAll();
}
