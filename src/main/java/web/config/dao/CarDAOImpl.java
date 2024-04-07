package web.config.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 5, 4000));
        cars.add(new Car("Mercedes", 200, 5000));
        cars.add(new Car("Audi", 4, 3000));
        cars.add(new Car("Mazda", 6, 1500));
        cars.add(new Car("Volvo", 90, 2700));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

}
