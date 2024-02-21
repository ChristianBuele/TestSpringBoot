package com.jpa.swagger.interfaces;

import com.jpa.swagger.entities.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoferRepository extends JpaRepository<Chofer,Long> {
}
