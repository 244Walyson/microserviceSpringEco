package com.waly.CarService.dto;

import com.waly.CarService.entities.Brand;
import com.waly.CarService.entities.Model;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModelDTO {

    private Long id;
    private String name;

    public static ModelDTO of(Model entity){
        ModelDTO dto = new ModelDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
