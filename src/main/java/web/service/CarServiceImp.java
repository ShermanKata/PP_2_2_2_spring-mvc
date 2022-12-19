package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "model1", 101));
        cars.add(new Car(2, "model2", 202));
        cars.add(new Car(3, "model3", 303));
        cars.add(new Car(4, "model4", 404));
        cars.add(new Car(5, "model5", 505));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
