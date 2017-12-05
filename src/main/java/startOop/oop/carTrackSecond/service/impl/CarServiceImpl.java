package startOop.oop.carTrackSecond.service.impl;

import startOop.oop.carTrackSecond.dao.factory.DAOFactory;
import startOop.oop.carTrackSecond.dao.impl.CarDAOImpl;
import startOop.oop.carTrackSecond.model.Car;
import startOop.oop.carTrackSecond.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars() {
        CarDAOImpl allCarMethods = DAOFactory.getAllCarMethods();
        return allCarMethods.getAllCars();
    }

    @Override
    public void addPassenger(int human, Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().addPassenger(human, car);
        }
    }

    @Override
    public void startCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().startCar(car);
        }
    }

    @Override
    public void stopCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().stopCar(car);
        }
    }

    @Override
    public void moveCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().moveCar(car);
        }
    }
}
