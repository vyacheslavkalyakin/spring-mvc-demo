package web.service;

import web.model.CarModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<CarModel> getCars( int count) {
        List<CarModel> cars = List.of(new CarModel(1, "Toyota", "green"),
                new CarModel(2, "Lada", "black"),
                new CarModel(3, "Opel", "yellow"),
                new CarModel(4, "Nissan", "white"),
                new CarModel(5, "Ferrari", "red")
        );
        if (count > 0 && count < 5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }

    }
}
