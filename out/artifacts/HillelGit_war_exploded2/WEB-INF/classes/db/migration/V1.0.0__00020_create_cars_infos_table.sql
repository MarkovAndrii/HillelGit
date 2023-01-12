CREATE TABLE car_infos(
id serial CONSTRAINT cars_infos_pk PRIMARY KEY,
colour VARCHAR(25),
city VARCHAR(30),
country VARCHAR(25),
date TIMESTAMP,
about TEXT
);