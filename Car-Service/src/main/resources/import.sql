INSERT INTO tb_brand (name) VALUES ('Volkswagen');
INSERT INTO tb_brand (name) VALUES ('Chevrolet');
INSERT INTO tb_brand (name) VALUES ('Toyota');
INSERT INTO tb_brand (name) VALUES ('Honda')

INSERT INTO tb_model (name, brand_id) VALUES ('Gol', 1);
INSERT INTO tb_model (name, brand_id) VALUES ('Cruise', 2);
INSERT INTO tb_model (name, brand_id) VALUES ('Corolla', 3);
INSERT INTO tb_model (name, brand_id) VALUES ('Civic', 4);

INSERT INTO tb_engine (description, size, cylinders) VALUES ('GM', 2.0, 4);
INSERT INTO tb_engine (description, size, cylinders) VALUES ('Ford', 1.8, 4);
INSERT INTO tb_engine (description, size, cylinders) VALUES ('Honda', 1.6, 4);
INSERT INTO tb_engine (description, size, cylinders) VALUES ('Toyota', 2.5, 6);
INSERT INTO tb_engine (description, size, cylinders) VALUES ('Nissan', 2.3, 4);
INSERT INTO tb_engine (description, size, cylinders) VALUES ('BMW', 3.0, 6);

INSERT INTO tb_accessory (name) VALUES ('Air Conditioning');
INSERT INTO tb_accessory (name) VALUES ('GPS Navigation System');
INSERT INTO tb_accessory (name) VALUES ('Bluetooth Hands-Free');
INSERT INTO tb_accessory (name) VALUES ('Sunroof');
INSERT INTO tb_accessory (name) VALUES ('Leather Seats');
INSERT INTO tb_accessory (name) VALUES ('Backup Camera');
INSERT INTO tb_accessory (name) VALUES ('Keyless Entry');
INSERT INTO tb_accessory (name) VALUES ('Heated Seats');
INSERT INTO tb_accessory (name) VALUES ('Alloy Wheels');
INSERT INTO tb_accessory (name) VALUES ('Cruise Control');

INSERT INTO tb_car_location (longitude, latitude) VALUES ('1241241', '14134134');

INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2022, 'Red', 1, 4, 5, 1, 50000.0, 25000.0, 150.0, 800.0, 3000.0, 1.0, 'ABC12ERGSSC32342CECF', 'XYZ987', '2024', '1', '1', 1, 1, 1);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2021, 'Blue', 1, 4, 5, 2, 40000.0, 20000.0, 120.0, 700.0, 2500.0, 1.0, '435345TCDRGSARXESFE', 'LMN123', '2024', '2', '2', 2, 2, 3);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2018, 'White', 1, 4, 5, 3, 45000.0, 22000.0, 130.0, 750.0, 2800.0, 1.0, '43WTCSRGNJWFSECSEER', 'ABC345', '2024', '2', '1', 1, 3, 2);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2017, 'Gray', 1, 4, 5, 3, 38000.0, 19000.0, 115.0, 700.0, 2500.0, 1.0, 'ARSGDGCFGCTDTDF2CECF', 'STU456', '2024', '3', '3', 2, 4, 4);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2016, 'Brown', 1, 4, 5, 4, 52000.0, 21000.0, 125.0, 730.0, 2800.0, 1.0, 'ABC12ERGSSC32342CECF', 'MNO345', '2024', '2', '1', 1, 3, 1);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2015, 'Green', 1, 4, 5, 5, 36000.0, 17000.0, 105.0, 620.0, 2000.0, 1.0, 'ABC1RVGDRGC32342CECF', 'XYZ567', '2024', '1', '2', 2, 4, 3);
INSERT INTO tb_car ( manufacturing_year, color, location_id, number_of_doors, passenger_capacity, engine_id, mileage, selling_price, daily_rental_price, weekly_rental_price, monthly_rental_price, availability, chassis_number, license_plate, license, fuel_type, car_status, transmission, model_id, brand_id ) VALUES (2014, 'Purple', 1, 4, 5, 5, 48000.0, 20000.0, 120.0, 700.0, 2500.0, 1.0, 'RDGERTGSFSCDFG2342CECF', 'ABC234', '2024', '3', '3', 1, 3, 4);

INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (1, 2);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (3, 2);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (1, 3);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (5, 4);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (1, 5);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (1, 6);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (1, 7);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (2, 2);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (3, 1);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (4, 2);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (5, 6);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (6, 3);
INSERT INTO tb_accessory_car (car_id, accessory_id) VALUES (5, 3);

INSERT INTO tb_car_image (car_id, img_url) VALUES (1, 'https://exemplo.com/imagem1.jpg');
INSERT INTO tb_car_image (car_id, img_url) VALUES (1, 'https://exemplo.com/imagem2.jpg');
INSERT INTO tb_car_image (car_id, img_url) VALUES (2, 'https://exemplo.com/imagem3.jpg');

INSERT INTO tb_maintenance (description, started_at, service_provider, cost, mileage_at_maintenance, maintenance_status, comments, car_id) VALUES ('Oil Change', TIMESTAMP '2024-01-01 10:00:00', 'Auto Service Center', 100.0, 30000.0, 1, 'Routine oil change.', 1);
INSERT INTO tb_maintenance (description, started_at, service_provider, cost, mileage_at_maintenance, maintenance_status, comments, car_id) VALUES ('Brake Inspection', TIMESTAMP '2023-10-15 14:30:00', 'Brake Experts', 150.0, 25000.0, 2, 'Scheduled brake inspection.', 2);
INSERT INTO tb_maintenance (description, started_at, service_provider, cost, mileage_at_maintenance, maintenance_status, comments, car_id) VALUES ('Tire Rotation', TIMESTAMP '2022-05-20 09:45:00', 'Tire Care Shop', 80.0, 28000.0, 2, 'Regular tire rotation.', 1);

