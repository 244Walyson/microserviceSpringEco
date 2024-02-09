package com.waly.CarService.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.waly.CarService.dto.CarDTO;
import com.waly.CarService.entities.Car;
import com.waly.CarService.projections.CarProjection;
import com.waly.CarService.services.CarService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CarDTO> findById(@PathVariable Long id) throws JsonProcessingException {
        return ResponseEntity.ok().body(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<Page<CarProjection>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @PostMapping
    public ResponseEntity<CarDTO> insert(@RequestBody CarDTO dto) throws Exception{
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(service.insert(dto));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CarDTO> update(@PathVariable Long id, @RequestBody CarDTO dto) throws Exception{
        return ResponseEntity.ok().body(service.update(dto, id));
    }

}
