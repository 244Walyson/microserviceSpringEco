package com.waly.CarService.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.waly.CarService.dto.CarDTO;
import com.waly.CarService.entities.Accessory;
import com.waly.CarService.entities.Car;
import com.waly.CarService.entities.CarLocation;
import com.waly.CarService.entities.Model;
import com.waly.CarService.enums.CarStatusEnum;
import com.waly.CarService.enums.FuelTypeEnum;
import com.waly.CarService.projections.CarProjection;
import com.waly.CarService.repositories.*;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;

@Slf4j
@Service
public class CarService {

    @Autowired
    private CarRepository repository;
    private ModelMapper modelMapper = new ModelMapper();

    @Transactional(readOnly = true)
    public CarDTO findById(Long id) throws JsonProcessingException {
        Car car = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("car not found");
        });
        return  new CarDTO(car);
    }

    @Transactional(readOnly = true)
    public Page<CarProjection> findAll(Pageable pageable) {
        Page<CarProjection> car = repository.findAllProjectedBy(pageable);
        return car;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if (!repository.existsById(id)){
            throw new EntityNotFoundException("entity not found");
        }
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DataIntegrityViolationException("data integrity violation");
        }
    }

    @Transactional
    public CarDTO insert(CarDTO dto) throws Exception{
        Car car = copyDtoToClass(dto, new Car());
        car = repository.save(car);
        return new CarDTO(car);
    }

    @Transactional
    public CarDTO update(CarDTO dto, Long id) throws Exception {
        Car car = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("entity not found");
        });
        dto.setId(car.getId());
        car = copyDtoToClass(dto, car);
        car = repository.save(car);
        return new CarDTO(car);
    }
    private Car copyDtoToClass(CarDTO dto, Car car) {
        car.setAccessories(new HashSet<>());
        modelMapper.map(dto, car);
        return car;
    }


}
