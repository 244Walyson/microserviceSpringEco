package com.waly.ProductService.services;

import com.waly.ProductService.dto.ProductDTO;
import com.waly.ProductService.dto.ProductMinDTO;
import com.waly.ProductService.entities.Category;
import com.waly.ProductService.entities.Product;
import com.waly.ProductService.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Page<ProductMinDTO> findAll(Pageable pageable){
        List<Product> products = productRepository.findAll();
        List<ProductMinDTO> pageDto = products.stream().map(ProductMinDTO::toDto).toList();
        return new PageImpl<>(pageDto, pageable, pageable.getPageSize());
    }

    @Transactional(readOnly = true)
    public Product findById(Long id){
        Product product = productRepository.findById(id).orElseThrow(() -> {
                    throw new EntityNotFoundException("Product not found");
        });
        return product;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if(!productRepository.existsById(id)){
            throw new RuntimeException("id not found");
        }
        try {
            productRepository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new RuntimeException("falha de integridade referencial");
        }
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto){
        Product product = copyDtoToEntity(dto);
        product = productRepository.save(product);
        return new ProductDTO().toDto(product);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto){
        return null;
    }

    private Product copyDtoToEntity(ProductDTO dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setQuantity(dto.getQuantity());
        product.setRates(dto.getRates());
        product.setCategories(dto.getCategories());
        product.setImgUrl(dto.getImgUrl());
        return product;
    }
}
