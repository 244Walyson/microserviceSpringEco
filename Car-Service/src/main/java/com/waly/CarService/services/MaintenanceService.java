package com.waly.CarService.services;

import com.waly.CarService.dto.MaintenanceDTO;
import com.waly.CarService.entities.Maintenance;
import com.waly.CarService.enums.MaintenanceStatusEnum;
import com.waly.CarService.repositories.MaintenanceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository repository;
    private ModelMapper modelMapper = new ModelMapper();

    @Transactional(readOnly = true)
    public Page<MaintenanceDTO> findAll(Pageable pageable){
        return repository.findAll(pageable).map(MaintenanceDTO::of);
    }

    @Transactional
    public MaintenanceDTO insert(MaintenanceDTO dto){
        Maintenance maintenance = new Maintenance();
        copyDtoToEntity(dto, maintenance);
        maintenance = repository.save(maintenance);
        return MaintenanceDTO.of(maintenance);
    }

    public void copyDtoToEntity(MaintenanceDTO dto, Maintenance entity){
        if(dto.getStartedAt() == null){
            dto.setStartedAt(Instant.now());
        }
        dto.setMaintenanceStatus(MaintenanceStatusEnum.PENDING);
        modelMapper.map(dto, entity);
    }
}
