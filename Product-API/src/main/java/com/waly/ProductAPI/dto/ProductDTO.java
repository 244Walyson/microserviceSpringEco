package com.waly.ProductAPI.dto;

import com.waly.ProductAPI.entities.Category;
import com.waly.ProductAPI.entities.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private String imgUrl;
    private Instant createdAt;
    private Integer quantity;
    private Set<CategoryDTO> categories;

    public ProductDTO(Long id, String name, String description, String imgUrl, Instant createdAt, Integer quantity, Set<CategoryDTO> categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.categories = categories;
    }

    public ProductDTO() {
    }


    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        imgUrl = product.getImgUrl();
        createdAt = product.getCreatedAt();
        quantity = product.getQuantity();
        categories = product.getCategories().stream().map(x -> new CategoryDTO(x)).collect(Collectors.toSet());
    }
}
