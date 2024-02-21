package com.jpa.swagger.interfaces;

import com.jpa.swagger.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro,Long> {
}
