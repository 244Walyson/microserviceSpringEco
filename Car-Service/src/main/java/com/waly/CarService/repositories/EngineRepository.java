package com.waly.CarService.repositories;

import com.waly.CarService.entities.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Engine, Long> {
}
