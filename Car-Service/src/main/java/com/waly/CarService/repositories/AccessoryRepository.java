package com.waly.CarService.repositories;

import com.waly.CarService.entities.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
}
