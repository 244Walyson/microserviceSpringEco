package com.waly.CarService.dto;

import com.waly.CarService.entities.Car;
import com.waly.CarService.entities.Maintenance;
import com.waly.CarService.enums.MaintenanceStatusEnum;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MaintenanceDTO {

    private Long id;
    private String description;
    private Instant startedAt;
    private Instant finishedAt;
    private String serviceProvider;
    private Double cost;
    private Double mileageAtMaintenance;
    private MaintenanceStatusEnum maintenanceStatus;
    private String comments;


    public static MaintenanceDTO of(Maintenance entity){
        MaintenanceDTO dto = new MaintenanceDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
