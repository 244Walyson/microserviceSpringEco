package com.waly.ProductAPI.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.waly.ProductAPI.dto.ProductDTO;
import com.waly.ProductAPI.entities.Product;
import com.waly.ProductAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) throws JsonProcessingException {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
