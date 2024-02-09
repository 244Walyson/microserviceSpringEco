package com.waly.ProductAPI.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.waly.ProductAPI.dto.ProductDTO;
import com.waly.ProductAPI.entities.Category;
import com.waly.ProductAPI.entities.Product;
import com.waly.ProductAPI.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO findById(Long id) throws JsonProcessingException {
        Product product = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("not found");
        });
        for (Category cat : product.getCategories()){
            log.info(new ObjectMapper().writeValueAsString(cat));
        }
        if (product.getCategories().isEmpty()){
            log.info("vaziooooooooooo");
        }
        return new ProductDTO(product);
    }
}
