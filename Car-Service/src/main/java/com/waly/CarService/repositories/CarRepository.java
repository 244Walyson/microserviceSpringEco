package com.waly.CarService.repositories;

import com.waly.CarService.entities.Car;
import com.waly.CarService.projections.CarProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(nativeQuery = true, value = """
            SELECT DISTINCT
                c.id AS id,
                c.manufacturing_year AS manufacturingYear,
                c.color AS color,
                c.number_of_doors AS numberOfDoors,
                c.passenger_capacity AS passengerCapacity,
                c.mileage AS mileage,
                c.selling_price AS sellingPrice,
                c.daily_rental_price AS dailyRentalPrice,
                c.weekly_rental_price AS weeklyRentalPrice,
                c.monthly_rental_price AS monthlyRentalPrice,
                c.availability AS availability,
                c.chassis_number AS chassisNumber,
                c.license_plate AS licensePlate,
                b.name AS brand,
                m.name AS model,
                (SELECT STRING_AGG(i2.img_url, ',') FROM tb_car_image i2 WHERE i2.car_id = c.id) AS images
            FROM tb_car c
            INNER JOIN tb_brand b ON c.brand_id = b.id
            INNER JOIN tb_model m ON c.model_id = m.id
            LEFT JOIN tb_car_image i ON c.id = i.car_id
            GROUP BY c.id, i.img_url
            """)
    Page<CarProjection> findAllProjectedBy(Pageable pageable);


}
