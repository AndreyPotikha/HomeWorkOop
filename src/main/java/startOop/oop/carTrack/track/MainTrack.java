package startOop.oop.carTrack.track;

public class MainTrack {

    public static void main(String[] args) {


        Track track1 = new Track();
        track1.setNumber("AA");
        track1.roll();
        track1.roll();

        Track track2 = new Track();
        track2.setNumber("BB");
        track2.roll();
        track2.roll();

        track1.stop();
        track1.stop();
        track2.stop();
        track2.stop();


     /*   Track track1 = new Track();
        Track track2 = new Track();

        track1.setNumber("АИ4312ВГ");
        track2.setNumber("АА2312ВГ");
        track1.roll();
        track2.roll();
        System.out.println();
        Track trackStatus = new Track(1);
        track1.roll();
        System.out.println();
        track1.stop();
        track2.stop();
        System.out.println();
        Track trackStatus1 = new Track(0);
        track2.stop();
        */
    }
}
