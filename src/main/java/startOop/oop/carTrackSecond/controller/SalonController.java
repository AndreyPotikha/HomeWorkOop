package startOop.oop.carTrackSecond.controller;

import startOop.oop.carTrackSecond.model.Car;
import startOop.oop.carTrackSecond.model.Track;
import startOop.oop.carTrackSecond.service.CarService;
import startOop.oop.carTrackSecond.service.TrackService;
import startOop.oop.carTrackSecond.service.factory.ServiceFactory;

import java.util.List;

public class SalonController {
    public static void main(String[] args) {

        CarService allCarMethods = ServiceFactory.getAllCarMethods();
        TrackService allTrackMethods = ServiceFactory.getAllTrackMethods();

        List<Car> allCars = allCarMethods.getAllCars();
        List<Track> allTracks = allTrackMethods.getAllTracks();

        Car car = allCars.get(0);
        Track track = allTracks.get(0);
        car.setTrack(track);
        System.out.println(car.getTrack());

        car.unSetTrack(track);
        System.out.println(car.getTrack());

        System.out.println("List with cars:");
        for (Car elem : allCars) {
            System.out.println(elem.getNumber());
        }
        System.out.println("List with tracks:");
        for (Track elem : allTracks) {
            System.out.println(elem.getNumber());
        }
        System.out.println();
        car.setTrack(track);

        System.out.println(car.getCarState());
        System.out.println(track.getStatus());
        allCarMethods.startCar(car);
        System.out.println(car.getCarState());
        System.out.println(track.getStatus());
        allCarMethods.moveCar(car);
        System.out.println(car.getCarState());
        System.out.println(track.getStatus());
        allCarMethods.stopCar(car);
        System.out.println(car.getCarState());
        System.out.println(track.getStatus());
        System.out.println();

        allTrackMethods.roll(track);
        System.out.println(track.getStatus());

        allTrackMethods.stop(track);
        System.out.println(track.getStatus());
        System.out.println();

        System.out.println("Cars with Tracks:");
        for (Car elem : allCars) {
            try {
                if (elem.getTrack().isWithCar() == true) {
                    System.out.println(elem.getNumber() + " attached with track: " + elem.getTrack().getNumber());
                }
            } catch (NullPointerException e) {
                System.out.println("Car with number: " + elem.getNumber() + " don`t have a track");
            }
        }


    }
}
