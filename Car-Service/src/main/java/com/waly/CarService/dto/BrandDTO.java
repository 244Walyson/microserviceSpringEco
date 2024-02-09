package com.waly.CarService.dto;

import com.waly.CarService.entities.Brand;
import com.waly.CarService.entities.Model;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BrandDTO {

    private Long id;
    private String name;

    public static BrandDTO of(Brand entity){
        BrandDTO dto = new BrandDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
