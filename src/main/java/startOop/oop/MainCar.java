package startOop.oop;

import java.util.Random;

public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.number = "AA 1111";
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
        car1.status = random.nextInt(3);
        car1.star();
        car1.move();
        car1.stop();
        int count;
        /*for (int i = 0; i < 3; i++) {
            count = random.nextInt(11) - 5;
            car1.addHuman(count);
            car2.addHuman(count);
            car1.printAboutMe();
            car2.printAboutMe();
        }*/
    }
}
