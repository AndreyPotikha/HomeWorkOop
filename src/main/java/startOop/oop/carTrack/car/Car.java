package startOop.oop.carTrack.car;

import startOop.oop.carTrack.track.Track;

public class Car {
    private String number;
    private String color;
    private String marka;
    private int countHuman = 0;
    int status = 0;
    private Track track;
    private static int carAndTrack = 0;


    public void setTrack(Track tr) {
        if (track == null) {
            this.track = tr;
            carAndTrack++;
        } else {
            System.out.println("Прицеп уже закреплен");
        }
    }

    public void unSetTrack() {
        carAndTrack--;
        track = null;
    }

    public Car() {
    }
    public Car(String number) {
        this.number = number;
    }
    public Car(String number, String color) {
        this.number = number;
        this.color = color;
    }
    public Car(String number, String color, String marka, int countHuman) {
        this.number = number;
        this.color = color;
        this.marka = marka;
    }

    public int getCarAndTrack() { return carAndTrack; }
    public void setCarAndTrack(int carAndTrack) { this.carAndTrack = carAndTrack; }
    public String getMarka() { return marka; }
    public void setMarka(String marka) { this.marka = marka; }
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

    public static void getCountCars() {

    }

    public void printAboutMe() {
        System.out.println("Number - " + number + ", color - " + color + ", passangers - " + countHuman + ", marka - " + marka);
    }

    public void addHuman(int count) {
        countHuman = count;
    }

    public void star(Track track) {
        if (status == 0) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman + " звелась" + "прицеп");
        } else if (status == 1) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman
                    + " не могу завестись, так как уже заведена");
        } else {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - "
                    + countHuman + " не могу завестись так как уже заведена");
        }

    }
    public void move(Track track) {
        if (status == 0) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman + " поехала "
                    + "с прицепом "
                    + track);
        } else if (status == 1) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman
                    + " не могу ехать так как уже еду" + " с прицепом "
                    + track);
        } else {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - "
                    + countHuman + " не могу ехать так как еще не заведена" + " с прицепом "
                    + track);
        }

    }
    public void stop(Track track) {
        if (status == 0) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman
                    + " остановилось с выключением двигателя" + " с прицепом  " + track);
            carAndTrack--;
        } else if (status == 1) {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - " + countHuman
                    + " не могу остановиться так как заведенная стою" + " с прицепом  " + track);
        } else {
            System.out.println("Авто" + "Number - " + number + ", color - " + color + ", passangers - "
                    + countHuman + " не могу остановиться так как не заведенная стою" + " с прицепом  " + track);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", marka='" + marka + '\'' +
                ", countHuman=" + countHuman +
                ", status=" + status +
                ", track=" + track +
                '}';
    }
}
