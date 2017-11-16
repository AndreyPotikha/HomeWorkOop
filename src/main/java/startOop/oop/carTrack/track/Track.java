package startOop.oop.carTrack.track;

import startOop.oop.carTrack.car.Car;

public class Track {

    private String number;
    private int status = 0;

    public void setStatus(int status) {
        this.status = status;
    }

    public Track() {
    }

    public Track(int status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void roll() {
            Car car = new Car();
        if (car.getCarAndTrack() < 1) {
            status++;
            if (status <= 1) {
                System.out.println("Прицеп с номером " + getNumber() + " начал катиться");
            } else {
                System.out.println("Прицеп с номером " + getNumber() + " уже катится");
            }
        }
    }
    public void stop() {
        Car car = new Car();
        if (car.getCarAndTrack() == 0) {
            status--;
            if (status == 1) {
                System.out.println("Прицеп с номером " + getNumber() + " остановился");
            } else {
                System.out.println("Прицеп с номером " + getNumber() + " нельза остановить, он уже стоит");
            }
        } else
            System.out.println("Сперва отсоедените прицеп от машины");
    }

    @Override
    public String toString() {
        return "number='" + number + '\'' +
                '}';
    }
}
