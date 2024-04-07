package web.config.service;

import org.springframework.stereotype.Service;
import web.config.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> allCars = carDao.getAllCars();

        if (count == 0) {
            return allCars;
        }

        return allCars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

}
