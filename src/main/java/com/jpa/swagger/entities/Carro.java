package com.jpa.swagger.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carros")
@Data
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    @ManyToOne
    @JoinColumn(name = "id_chofer")
    private Chofer chofer;
}
