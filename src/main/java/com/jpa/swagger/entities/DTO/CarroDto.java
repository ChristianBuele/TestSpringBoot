package com.jpa.swagger.entities.DTO;

import com.jpa.swagger.entities.Chofer;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CarroDto {
    @NotBlank(message = "Es obligatorio")
    private String marca;

    @ManyToOne
    @JoinColumn(name = "id_chofer")
    @NotNull(message = "Chofer es obligatorio")
    private Chofer chofer;
}
