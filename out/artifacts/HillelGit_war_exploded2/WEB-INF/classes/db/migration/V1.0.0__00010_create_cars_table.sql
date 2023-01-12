CREATE TABLE cars(
    id serial CONSTRAINT cars_pk PRIMARY KEY,
    model VARCHAR(20),
    vin_code VARCHAR(17),
    type VARCHAR(25),
    car_info_id INT UNIQUE
);