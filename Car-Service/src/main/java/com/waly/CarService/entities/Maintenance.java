package com.waly.CarService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.waly.CarService.enums.MaintenanceStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Instant startedAt;
    private Instant finishedAt;
    private String serviceProvider;
    private Double cost;
    private Double mileageAtMaintenance;
    @Enumerated(EnumType.ORDINAL)
    private MaintenanceStatusEnum maintenanceStatus;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "car_id")
    @JsonBackReference
    private Car car;
}
