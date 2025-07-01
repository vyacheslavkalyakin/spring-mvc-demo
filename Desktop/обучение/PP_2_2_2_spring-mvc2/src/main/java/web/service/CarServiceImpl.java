package web.service;

import web.dao.DaoCarList;
import web.model.CarModel;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final DaoCarList daoCarList;

    public CarServiceImpl(DaoCarList daoCarList) {
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

