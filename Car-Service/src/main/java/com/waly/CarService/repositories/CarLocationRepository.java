package com.waly.CarService.repositories;

import com.waly.CarService.entities.Car;
import com.waly.CarService.entities.CarLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarLocationRepository extends JpaRepository<CarLocation, Long> {
}
