package com.waly.CarService.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.waly.CarService.entities.Accessory;
import com.waly.CarService.entities.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccessoryDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private Set<Car> cars;

    public static AccessoryDTO of(Accessory entity){
        AccessoryDTO dto = new AccessoryDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
