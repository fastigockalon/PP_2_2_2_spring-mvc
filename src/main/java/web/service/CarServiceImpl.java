package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private static int COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT,"model1",1));
        cars.add(new Car(++COUNT,"model2",2));
        cars.add(new Car(++COUNT,"model3",3));
        cars.add(new Car(++COUNT,"model4",1));
        cars.add(new Car(++COUNT,"model5",2));
    }

    @Override
    public List<Car> getList(int n) {
        System.out.println(cars.subList(0,n));
        return cars.subList(0,n);
    }
}
