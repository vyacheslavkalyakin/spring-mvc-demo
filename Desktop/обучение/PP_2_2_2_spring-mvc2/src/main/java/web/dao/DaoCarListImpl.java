package web.dao;

import org.springframework.stereotype.Repository;
import web.model.CarModel;
import java.util.List;

@Repository
public class DaoCarListImpl implements DaoCarList {

        private final List<CarModel> cars = List.of(
                new CarModel(1, "Toyota", "green"),
                new CarModel(2, "Lada", "black"),
                new CarModel(3, "Opel", "yellow"),
                new CarModel(4, "Nissan", "white"),
                new CarModel(5, "Ferrari", "red")
        );
    @Override
    public List<CarModel> getAllCars() {
        return cars;
    }
}
