package startOop.oop.phone2;

import java.util.ArrayList;
import java.util.List;

public class MainPhone {

    public static void main(String[] args) {

        /*Phone phone1 = new Nokia();
        Phone phone2 = new Samsung();
        Phone phone3 = new iPhone4();
        Phone phone4 = new iPhone5();
        List<Phone> nokia = ((Nokia)phone1).nokia();
        List<Phone> samsung = ((Samsung)phone2).samsung();
        List<Phone> iphon4 = ((iPhone4)phone3).iphon4();
        List<Phone> iphon5 = ((iPhone5)phone4).iphon5();
*/
        printModel();
        printAppleId();

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто звонит: ");
        String number = scanner.nextLine();
        System.out.println("Кому звоним: ");
        String number2 = scanner.nextLine();

        switch (number) {
            case "1":
                switch (number2) {
                    case "2":
                        phone1.call(samsung);
                        break;
                    case "3":
                        phone1.call(iphon4);
                        break;
                    case "4":
                        phone1.call(iphon5);
                        break;
                        default:
                            System.out.println("Невозможно позвонить");
                }
                break;
            case "2":
                switch (number2) {
                    case "1":
                        phone2.call(nokia);
                        break;
                    case "3":
                        phone2.call(iphon4);
                        break;
                    case "4":
                        phone2.call(iphon5);
                        break;
                    default:
                        System.out.println("Невозможно позвонить");
                }
                break;
            case "3":
                switch (number2) {
                    case "1":
                        phone3.call(nokia);
                        break;
                    case "2":
                        phone3.call(samsung);
                        break;
                    case "4":
                        phone3.call(iphon5);
                        break;
                    default:
                        System.out.println("Невозможно позвонить");
                }
                break;
            case "4":
                switch (number2) {
                    case "1":
                        phone4.call(nokia);
                        break;
                    case "2":
                        phone4.call(samsung);
                        break;
                    case "3":
                        phone4.call(iphon4);
                        break;
                    default:
                        System.out.println("Невозможно позвонить");
                }
                break;
                default:
                    System.out.println("Нету такого номера");
        }
*/

    }

    public static void printAppleId() {
        Phone phone1 = new Nokia();
        Phone phone2 = new Samsung();
        Phone phone3 = new iPhone4();
        Phone phone4 = new iPhone5();
        List<Phone> nokia = ((Nokia)phone1).nokia();
        List<Phone> samsung = ((Samsung)phone2).samsung();
        List<Phone> iphon4 = ((iPhone4)phone3).iphon4();
        List<Phone> iphon5 = ((iPhone5)phone4).iphon5();
        List<Integer> listModel = new ArrayList<>();

        for (Phone phone : nokia) {
            if (phone instanceof iPhone) {
                System.out.println(listModel.add(((iPhone) phone).getAppleid()));
            }
        }
        for (Phone phone : samsung) {
            if (phone instanceof iPhone) {
                System.out.println(listModel.add(((iPhone) phone).getAppleid()));
            }
        }
        for (Phone phone : iphon4) {
            if (phone instanceof iPhone) {
               listModel.add(((iPhone) phone).getAppleid());
            }
        }
        for (Phone phone : iphon5) {
            if (phone instanceof iPhone) {
               listModel.add(((iPhone) phone).getAppleid());
            }
        }

       System.out.println(listModel);
    }

    public static void printModel() {
        Phone phone1 = new Nokia();
        Phone phone2 = new Samsung();
        Phone phone3 = new iPhone4();
        Phone phone4 = new iPhone5();
        List<Phone> nokia = ((Nokia)phone1).nokia();
        List<Phone> samsung = ((Samsung)phone2).samsung();
        List<Phone> iphon4 = ((iPhone4)phone3).iphon4();
        List<Phone> iphon5 = ((iPhone5)phone4).iphon5();
        List<String> listModel = new ArrayList<>();


        for (Phone phone : nokia) {
            listModel.add(phone.getName());
        }
        for (Phone phone : samsung) {
            listModel.add(phone.getName());
        }
        for (Phone phone : iphon4) {
            listModel.add(phone.getName());
        }
        for (Phone phone : iphon5) {
            listModel.add(phone.getName());
        }

        System.out.println(listModel);
    }
}
