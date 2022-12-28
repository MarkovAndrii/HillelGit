package lesson25Practice.service;

import lesson25Practice.dao.CarDao;
import lesson25Practice.entity.Car;

import java.util.List;

public class CarService {
    private CarDao carDao = new CarDao();

    public void save(Car car) {
        System.out.println("Car data for save: " + car);
        carDao.save(car);
    }

    public Car getById(int id) {
        System.out.println("Id for getting car: " + id);
        return carDao.getById(id);
    }

    public void update(Car car) {
        System.out.println("Car date for update: " + car.toString());
        carDao.update(car);
    }

    public void delete(Car car) {
        System.out.println("Car for deleting: " + car);
        carDao.delete(car);
    }

    public Car getByVinCode(String vinCode) {
        System.out.println("ViCode for getting car: " + vinCode);
        return carDao.getByVinCode(vinCode);
    }

    public List<Car> getAll() {
        System.out.println("getting all cars...");
        return carDao.getAll();
    }

    public Car getByModel(String model) {
        System.out.println("Model for getting car: " + model);
        return carDao.getByModel(model);
    }
}
