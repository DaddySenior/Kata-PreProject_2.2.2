package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> listOfCars() {
        return carDao.listOfCars();
    }

    @Override
    public List<Car> getAmountOfCars(int count) {
        return carDao.getAmountOfCars(count);
    }
}