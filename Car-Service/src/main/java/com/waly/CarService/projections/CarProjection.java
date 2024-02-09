package com.waly.CarService.projections;

import com.waly.CarService.dto.BrandDTO;
import com.waly.CarService.dto.CarDTO;
import com.waly.CarService.dto.ModelDTO;

import java.util.List;
import java.util.Set;

public interface CarProjection {
        Long getId();
        Integer getManufacturingYear();
        String getColor();
        Integer getNumberOfDoors();
        Integer getPassengerCapacity();
        Double getMileage();
        Double getSellingPrice();
        Double getDailyRentalPrice();
        Double getWeeklyRentalPrice();
        Double getMonthlyRentalPrice();
        String getImages();
        String getModel();
        String getBrand();



}
