package startOop.oop.carTrack.autoSalon;

import startOop.oop.carTrack.car.Car;
import startOop.oop.carTrack.track.Track;

import java.util.List;

public class AutoSalon {
    private static List<Car> cars;
    private static List<Track> tracks;
    private static String[] menuList;

    public static List<Car> getCars() { return cars; }
    public static void setCars(List<Car> cars) { AutoSalon.cars = cars; }
    public static List<Track> getTracks() { return tracks; }
    public static void setTracks(List<Track> tracks) { AutoSalon.tracks = tracks; }
    public static String[] getMenuList() { return menuList; }
    public static void setMenuList(String[] menuList) { AutoSalon.menuList = menuList; }

    public void strart() {
        System.out.println("открыли атосалон");
    }
}
