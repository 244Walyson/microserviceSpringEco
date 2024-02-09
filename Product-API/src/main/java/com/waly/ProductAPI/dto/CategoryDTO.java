package com.waly.ProductAPI.dto;

import com.waly.ProductAPI.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Set;
import java.util.stream.Collectors;

public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductDTO> products;

    public CategoryDTO() {
    }

    public CategoryDTO(Category category) {
        id = category.getId();
        name = category.getName();
        products = category.getProducts().stream().map(x -> new ProductDTO(x)).collect(Collectors.toSet());
    }

    public CategoryDTO(Long id, String name, Set<ProductDTO> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products;
    }
}
