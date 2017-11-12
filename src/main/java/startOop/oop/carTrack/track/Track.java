package startOop.oop.carTrack.track;

public class Track {

    private String number;
    private int status = 0;


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
            if (status == 0) {
                System.out.println("Прицеп с номером " + getNumber() + " начал катиться");
            } else {
                System.out.println("Прицеп с номером " + getNumber() + " уже катится");
            }
    }
    public void stop() {
        if (status == 1) {
            System.out.println("Прицеп с номером " + getNumber() + " остановился");
        } else {
            System.out.println("Прицеп с номером " + getNumber() + " нельза остановить, он уже стоит");
        }
    }

    @Override
    public String toString() {
        return "number='" + number + '\'' +
                '}';
    }
}
