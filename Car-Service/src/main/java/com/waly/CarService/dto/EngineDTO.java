package com.waly.CarService.dto;

import com.waly.CarService.entities.Engine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EngineDTO {

    private Long id;
    private String description;
    private Double size;
    private Integer cylinders;

    public static EngineDTO of(Engine entity){
        EngineDTO dto = new EngineDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
