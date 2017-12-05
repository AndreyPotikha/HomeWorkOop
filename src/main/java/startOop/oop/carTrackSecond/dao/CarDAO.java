package startOop.oop.carTrackSecond.dao;

import startOop.oop.carTrackSecond.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAllCars();
    void addPassenger(int human, Car car);
    void startCar(Car car);
    void stopCar(Car car);
    void moveCar(Car car);
}
