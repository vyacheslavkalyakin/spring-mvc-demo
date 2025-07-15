package web.service;

import web.dao.CarDao;
import web.model.CarModel;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao daoCarList;

    public CarServiceImpl(CarDao daoCarList) {
        this.daoCarList = daoCarList;
    }

    @Override
    public List<CarModel> getCars(int count) {
        List<CarModel> allCars = daoCarList.getAllCars();

        return (count <= 0) ? Collections.emptyList() : (count < 5 ? allCars
                .stream().limit(count).collect(Collectors.toList()) : allCars);
    }
}

