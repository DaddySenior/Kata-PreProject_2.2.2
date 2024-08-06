package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listOfCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model", "color", 1));
        cars.add(new Car("model1", "color1", 2));
        cars.add(new Car("model2", "color2", 3));
        cars.add(new Car("model3", "color3", 4));
        cars.add(new Car("model4", "color4", 5));
        return cars;
    }

    @Override
    public List<Car> getAmountOfCars(int count) {
        if (count >= listOfCars().size()) {
            return listOfCars();
        } else {
            return listOfCars().stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }
}
