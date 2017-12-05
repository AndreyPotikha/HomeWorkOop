package startOop.oop.carTrackSecond.data;

import startOop.oop.carTrackSecond.model.Car;
import startOop.oop.carTrackSecond.model.Track;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("AA2233VI", "Black");
        Car car2 = new Car("VI1112DD", "Green");
        Car car3 = new Car();
        car3.setNumber("WW0123QQ");
        car3.setColor("White");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        return carList;
    }

    public static List<Track> getAllTracks() {
        List<Track> trackList = new ArrayList<>();
        Track track1 = new Track("222-55");
        Track track2 = new Track();
        track2.setNumber("123-00");
        trackList.add(track1);
        trackList.add(track2);
        return trackList;
    }
}
