package com.waly.CarService.dto;

import com.waly.CarService.entities.Car;
import com.waly.CarService.entities.CarLocation;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarLocationDTO {

    private Long id;
    private String latitude;
    private String longitude;

    public CarLocationDTO(CarLocation entity){
        this.setId(entity.getId());
        this.setLatitude(entity.getLatitude());
        this.setLongitude(entity.getLongitude());
    }
}
