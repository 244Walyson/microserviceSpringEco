package com.waly.ProductService.dto;

import com.waly.ProductService.entities.Product;
import com.waly.ProductService.entities.Rate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductMinDTO {

    private Long id;
    private String name;
    private String imgUrl;
    private Double price;
    private Double rate;

    public static ProductMinDTO toDto(Product entity){
        return ProductMinDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .imgUrl(entity.getImgUrl())
                .price(entity.getPrice())
                .rate(entity.getRate())
                .build();
    }
}
