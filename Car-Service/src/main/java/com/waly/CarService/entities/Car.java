package com.waly.CarService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.waly.CarService.enums.CarStatusEnum;
import com.waly.CarService.enums.FuelTypeEnum;
import com.waly.CarService.enums.TransmissionEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private FuelTypeEnum fuelType;
    private CarStatusEnum carStatus;
    @Enumerated(EnumType.ORDINAL)
    private TransmissionEnum transmission;
    private Integer numberOfGears;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    @JsonBackReference
    private Brand brand;
    @ElementCollection
    @CollectionTable(name = "tb_car_image", joinColumns = @JoinColumn(name = "car_id"))
    @Column(name = "img_url")
    private List<String> images;
    @ManyToOne
    @JoinColumn(name = "engine_id")
    private Engine engine;
    @ManyToOne
    @JoinColumn(name = "model_id")
    @JsonBackReference
    private Model model;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private CarLocation location;
    @ManyToMany
    @JoinTable(name = "tb_accessory_car",
        joinColumns = @JoinColumn(name = "car_id"),
        inverseJoinColumns = @JoinColumn(name = "accessory_id"))
    @JsonManagedReference
    private Set<Accessory> accessories;
    @OneToMany(mappedBy = "car")
    @JsonManagedReference
    private Set<Maintenance> maintenanceHistory;



}
