package com.waly.CarService.dto;

import com.waly.CarService.entities.*;
import com.waly.CarService.enums.CarStatusEnum;
import com.waly.CarService.enums.FuelTypeEnum;
import com.waly.CarService.enums.TransmissionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDTO {

    private Long id;
    private Integer manufacturingYear;
    private String color;
    private Integer numberOfDoors;
    private Integer passengerCapacity;
    private Double mileage;
    private Double sellingPrice;
    private Double dailyRentalPrice;
    private Double weeklyRentalPrice;
    private Double monthlyRentalPrice;
    private Double availability;
    private String chassisNumber;
    private String licensePlate;
    private String license;
    private EngineDTO engine;
    private BrandDTO brand;
    private TransmissionEnum transmission;
    private Integer numberOfGears;
    private ModelDTO model;
    private CarLocationDTO location;
    private List<String> images;
    private FuelTypeEnum fuelType;
    private CarStatusEnum carStatus;
    private Set<AccessoryDTO> accessories = new HashSet<>();
    private Set<MaintenanceDTO> maintenances = new HashSet<>();

    public CarDTO(Car entity){
        BeanUtils.copyProperties(entity, this);
        this.setEngine(new EngineDTO().of(entity.getEngine()));
        this.setModel(new ModelDTO().of(entity.getModel()));
        this.setLocation(new CarLocationDTO(entity.getLocation()));
        for (Maintenance maintenance : entity.getMaintenanceHistory()){
            maintenances.add(new MaintenanceDTO().of(maintenance));
        }
        for (Accessory acc : entity.getAccessories()){
            accessories.add(new AccessoryDTO().of(acc));
        }
        this.setBrand(new BrandDTO().of(entity.getBrand()));
    }

}
