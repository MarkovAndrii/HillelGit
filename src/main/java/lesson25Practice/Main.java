package lesson25Practice;

import lesson25Practice.entity.Car;
import lesson25Practice.entity.Gender;
import lesson25Practice.entity.Info;
import lesson25Practice.entity.Owner;
import lesson25Practice.service.CarService;
import lesson25Practice.service.OwnerService;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        //save Car
//        Car car = new Car();
//        car.setModel("Audi");
//        car.setVinCode("GU33385488067");
//        car.setType("passenger");
//        carService.save(car);

        //getById
//        Car carById = carService.getById(1);
//        System.out.println(carById);

        //update
//        carById.setModel("VW");
//        carById.setVinCode("GR34284488380");
//        carById.setType("passenger");
//        carById.setCarInfoId(null);
//        carService.update(carById);

        //delete
//        Car carForDelete = carService.getById(3);
//        carService.delete(carForDelete);

        //getByVinCode
//        Car carByVinCode = carService.getByVinCode("GU33385488067");
//        System.out.println(carByVinCode);

        //getAll
//        List<Car> cars = carService.getAll();
//        System.out.println(cars);

        //getByModel
//        Car carByModel = carService.getByModel("VW");
//        System.out.println(carByModel);

        OwnerService ownerService = new OwnerService();

        //save Owner
        Owner owner = new Owner();
        owner.setName("Rico");
        owner.setSurname("Strong");
        owner.setGender(Gender.MAN);
        owner.setInfo(new Info(
                "Kharkiv",
                "Ukraine",
                LocalDateTime.of(1999, 7, 15, 14, 30),
                null
        ));
        ownerService.save(owner);
    }
}
