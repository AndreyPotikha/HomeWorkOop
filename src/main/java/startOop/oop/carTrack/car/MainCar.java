package startOop.oop.carTrack.car;

import startOop.oop.carTrack.track.Track;

public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Track track1 = new Track();
        Track track2 = new Track();

        track1.setNumber("AA1111AA");
        car1.setTrack(track1);
        car1.color = "Blue";
        car1.setNumber("CC 3333");
        car1.setMarka("BMW");
        System.out.println(car1);
        track2.setNumber("BB1111BB");
        car2.setTrack(track2);
        car2.color = "Blue";
        car2.setNumber("CC 3333");
        car2.setMarka("BMW");
        System.out.println(car2);
        System.out.println();

        car1.move();
        track1.roll();



       /*  car1.number = "AA 1111";
        car1.color = "Blue";
        car1.setNumber("CC 3333");
        car2.number = "BB 2222";
        car2.color = "Black";
        car1.printAboutMe();
        car2.printAboutMe();
        System.out.println();
        System.out.println("car1.getNumber()="+car1.getNumber());
        System.out.println("car2.getNumber()="+car2.getNumber());
        System.out.println();

       Random random = new Random();
        int randomMethod;
        for (int i = 0; i < 10; i++) {
            randomMethod = random.nextInt(3) + 1;
            switch (randomMethod) {
                case 1:
                    car1.status = random.nextInt(3);
                    car1.star();
                    break;
                case 2:
                    car1.status = random.nextInt(3);
                    car1.move();
                    break;
                case 3:
                    car1.status = random.nextInt(3);
                    car1.stop();
                    break;
            }

        }
        int count;
        for (int i = 0; i < 3; i++) {
            count = random.nextInt(11) - 5;
            car1.addHuman(count);
            car2.addHuman(count);
            car1.printAboutMe();
            car2.printAboutMe();
        }*/
    }
}
