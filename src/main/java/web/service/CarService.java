package web.service;

import web.model.Car;

import java.util.List;

public  interface CarService {
    List<Car> listOfCars();
    List<Car> getAmountOfCars(int count);
}
