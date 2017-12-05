package startOop.oop.carTrackSecond.model;

public class Car {

    private String number;
    private String color;
    private int countPassenger;
    private CarsState carState = CarsState.STOP;
    private Track track;

    public Car(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public Car() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public CarsState getCarState() {
        return carState;
    }

    public void setCarState(CarsState carState) {
        this.carState = carState;
    }

    public Track getTrack() {
        return track;
    }

    /**
     * @param track checks track to connect to attached with car;
     *              if free - will attach.
     */
    public void setTrack(Track track) {
        if (track.isWithCar() == false) {
            this.track = track;
            track.setWithCar(true);
        } else {
            System.out.println("Sorry! This Track on another Car.");
        }
    }

    /**
     * @param track If car detaches its track, it track-parameter comes null;
     *              and this track comes withCar-parameter is false.
     */
    public void unSetTrack(Track track) {
        if (getTrack().equals(track)) {
            this.track = null;
            track.setWithCar(false);
        } else {
            System.err.println("You don`t have this Track!");
        }
    }

    @Override
    public String toString() {
        return "Car number: " + getNumber() + "\n"
                + "Color: " + getColor() + "\n"
                + "Count of Passengers: " + getCountPassenger() + "\n"
                + "Car state now: " + getCarState() + "\n"
                + "Track: " + "\n" + getTrack();
    }

    public enum CarsState {
        START,
        MOVE,
        STOP
    }
}
