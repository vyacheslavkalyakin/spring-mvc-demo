package web.service;

import web.dao.CarDao;
import web.model.CarModel;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao daoCarList;

    public CarServiceImpl(CarDao daoCarList) {
        this.daoCarList = daoCarList;
    }

    @Override
    public List<CarModel> getCars(int count) {
        List<CarModel> allCars = daoCarList.getAllCars();

        if (count <= 0) {
            return Collections.emptyList(); // ничего не выводим
        } else if (count < 5) {
            return allCars.subList(0, count);
        } else {
            return allCars;
        }
    }
}

