package com.jpa.swagger.controllers;

import com.jpa.swagger.Helpers.ValidationErrors;
import com.jpa.swagger.entities.Carro;
import com.jpa.swagger.entities.Chofer;
import com.jpa.swagger.entities.DTO.CarroDto;
import com.jpa.swagger.services.CarroService;
import com.jpa.swagger.services.ChoferService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
    @Autowired
    CarroService carroService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChoferService choferService;

    @GetMapping()
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(carroService.findAll());
    }
    @PostMapping
    public ResponseEntity<?> create(@Valid  @RequestBody CarroDto carroDto, BindingResult result){
        if(result.hasErrors()){
            return ResponseEntity.badRequest().body(ValidationErrors.validation(result));
        }
        Optional<Chofer> choferOptional=choferService.findById(1L);
        if(!choferOptional.isPresent()){
            return ResponseEntity.badRequest().body("No se encuentra id");
        }
        Carro carro=modelMapper.map(carroDto,Carro.class);


        return ResponseEntity.ok().body(carroService.save(carro));
    }
    @PostMapping("/create")
    public ResponseEntity<?> createTwoEntities(@Valid @RequestBody CarroDto carroDto,BindingResult result){
        if(result.hasErrors()){
            return ResponseEntity.badRequest().body(ValidationErrors.validation(result));
        }
        Carro carro=modelMapper.map(carroDto,Carro.class);
        return ResponseEntity.ok().body(carroService.save(carro));
    }
}
