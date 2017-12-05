package startOop.oop.carTrackSecond.dao.impl;

import startOop.oop.carTrackSecond.dao.CarDAO;
import startOop.oop.carTrackSecond.data.Database;
import startOop.oop.carTrackSecond.model.Car;
import startOop.oop.carTrackSecond.model.Track;

import java.util.List;

public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getAllCars() {
        return Database.getAllCars();
    }

    @Override
    public void addPassenger(int human, Car car) {
        if (human > -5 & human <= 5) {
            car.setCountPassenger(car.getCountPassenger() + human);
        }
    }

    @Override
    public void startCar(Car car) {
        Car.CarsState carsState = car.getCarState();
        switch (carsState) {
            case START:
                System.out.println("Can`t start, because car is working now");
                break;
            case STOP:
                System.out.println("The car was started.");
                car.setCarState(Car.CarsState.START);
                break;
            case MOVE:
                System.out.println("Can`t start, because car is moving now");
                break;
            default:
                break;
        }
    }

    @Override
    public void stopCar(Car car) {
        Car.CarsState carsState = car.getCarState();
        switch (carsState) {
            case START:
                System.out.println("Can`t stop, because working now and wait when will drive.");
                break;
            case STOP:
                System.out.println("Can`t stop, because did not start early.");
                break;
            case MOVE:
                System.out.println("Car was stop and off.");
                car.setCarState(Car.CarsState.STOP);
                if (car.getTrack() != null) {
                    car.getTrack().setStatus(Track.Doing.STOP);
                    System.out.println("Your track was stop too.");
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void moveCar(Car car) {
        Car.CarsState carsState = car.getCarState();
        switch (carsState) {
            case START:
                System.out.println("The car moves now. All is OK.");
                car.setCarState(Car.CarsState.MOVE);
                if (car.getTrack() != null) {
                    car.getTrack().setStatus(Track.Doing.MOVE);
                    System.out.println("Your track move with car.");
                }
                break;
            case STOP:
                System.out.println("Car can`t move, because did not started before.");
                break;
            case MOVE:
                System.out.println("Car can`t move, because moving now.");
                break;
        }
    }
}
