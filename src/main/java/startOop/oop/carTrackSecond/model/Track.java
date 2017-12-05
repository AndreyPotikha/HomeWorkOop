package startOop.oop.carTrackSecond.model;

public class Track {

    private String number;
    private Doing status = Doing.STOP;
    private boolean withCar = false;

    public Track(String number) {
        this.number = number;
    }

    public Track() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Doing getStatus() {
        return status;
    }

    public boolean isWithCar() {
        return withCar;
    }

    public void setWithCar(boolean withCar) {
        this.withCar = withCar;
    }

    public void setStatus(Doing status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Track number: " + getNumber() + "\n"
                + "Status: " + getStatus() + "\n"
                + "Is with car this Track: " + isWithCar();
    }

    public enum Doing {
        STOP,
        MOVE,
        ROLL
    }
}
