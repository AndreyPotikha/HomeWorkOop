package startOop.oop.phone;

import startOop.oop.car.Database;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainPhone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or select randomly? Enter 1 - to enter number or 2 - select randomly");
        String choise = scanner.nextLine();
        switch (choise) {
            case "1":
                System.out.println("From which number to call? (+380501234568, +380501234569, +380501234570,+380501234571, +380501234572)");
                for (int i = 1; i > 0; i++) {
                    String whichNumber = scanner.nextLine();
                    if (isNumberExist(whichNumber)) {
                        System.out.println("Which number will we call?");
                        String whoToCall = scanner.nextLine();
                        call(whichNumber, whoToCall);
                        return;
                    } else {
                        System.out.println("We do not have such a number in the database, enter the correct number");
                    }
                }
                break;
            case "2":
                Phone randomPhone = getRandomPhone();
                String numberOfRandomPhone = randomPhone.getMyNumber();
                System.out.println("Which number will we call?");
                String whoToCall = scanner.nextLine();
                call(numberOfRandomPhone, whoToCall);
        }

        scanner.close();
    }

    private static Phone getRandomPhone() {
        List<Phone> randPhone = Database.basePhone();
        Random random = new Random();
        return randPhone.get(random.nextInt(5));
    }

    private static void call(String whichNumber, String whoToCall) {
        List<Phone> checkNumber = Database.basePhone();
        for (Phone elem : checkNumber) {
            if (whichNumber.equals(elem.getMyNumber())) {
                System.out.println("The call was made from " + elem + " on the number " + whoToCall);
            }
        }
}

    private static boolean isNumberExist(String number) {
        List<Phone> checkNumber = Database.basePhone();
        for (Phone elem : checkNumber) {
            if (number.equals(elem.getMyNumber())) {
//                System.out.println("This number belongs to " + elem);
                return true;
            }
        }
        return false;
    }
}
