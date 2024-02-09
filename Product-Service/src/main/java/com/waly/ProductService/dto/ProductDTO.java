package com.waly.ProductService.dto;

import com.waly.ProductService.entities.Category;
import com.waly.ProductService.entities.Product;
import com.waly.ProductService.entities.Rate;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String description;
    private Double rate;
    private String imgUrl;
    private List<Rate> rates = new ArrayList<>();
    private Set<Category> categories = new HashSet<>();

    public ProductDTO toDto(Product entity){
        copyCategories(entity.getCategories());
        copyRates(entity.getRates());
        return ProductDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .imgUrl(entity.getImgUrl())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .rate(entity.getRate())
                .quantity(entity.getQuantity())
                .build();
    }

    private void copyRates(List<Rate> ratesEn) {
        ratesEn.forEach(x -> rates.add(x));
    }

    private void copyCategories(Set<Category> categoriesEn) {
        categoriesEn.forEach(x -> categories.add(x));
    }

}
