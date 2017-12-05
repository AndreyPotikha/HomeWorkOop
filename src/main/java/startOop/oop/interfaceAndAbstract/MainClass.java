package startOop.oop.interfaceAndAbstract;

import startOop.oop.interfaceAndAbstract.abstractClass.AbstractGlass;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractHuman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static List<String> listOfTables;

    public static void main(String[] args) {

        List<String> humanSex = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            int counter = (int) (Math.random() * 2 + 1);
            String sex = "";
            switch (counter) {
                case 1:
                    HumanMan humanMan = new HumanMan();
                    sex = humanMan.sexMan() + i;
                    humanSex.add(sex);
                    break;
                case 2:
                    HumanWoman humanWoman = new HumanWoman();
                    sex = humanWoman.sexWoman() + i;
                    humanSex.add(sex);
                    break;
            }
        }
        System.out.println(humanSex);

        Table table = new Table();
        listOfTables = table.listOfTable();
        System.out.println(listOfTables);

        List<String> humanAndGlass = new ArrayList<>();
        for (String human : humanSex) {
            if (human.charAt(0) == 'm') {
                int counter = (int) (Math.random() * 2 + 1);
                switch (counter) {
                    case 1:
                        HumanMan humanMan = new HumanMan();
                        AbstractGlass abstractGlassSquare = new GlassSquare();
                        humanMan.takeGlass(abstractGlassSquare);
                        humanAndGlass.add(human + " " + humanMan.getManHaveOrNoHaveGlass());
                        break;
                    case 2:
                        HumanMan humanManCircle = new HumanMan();
                        AbstractGlass abstractGlassCircle = new GlassCircle();
                        humanManCircle.takeGlass(abstractGlassCircle);
                        humanAndGlass.add(human + " " + humanManCircle.getManHaveOrNoHaveGlass());
                        break;
                }
            } else {
                int counter = (int) (Math.random() * 2 + 1);
                switch (counter) {
                    case 1:
                        HumanWoman humanWomanSquare = new HumanWoman();
                        AbstractGlass abstractGlassSquare = new GlassSquare();
                        humanWomanSquare.takeGlass(abstractGlassSquare);
                        humanAndGlass.add(human + " " + humanWomanSquare.getWomanHaveOrNoHaveGlass());
                        break;
                    case 2:
                        HumanWoman humanWomanCircle = new HumanWoman();
                        AbstractGlass abstractGlassCircle = new GlassSquare();
                        humanWomanCircle.takeGlass(abstractGlassCircle);
                        humanAndGlass.add(human + " " + humanWomanCircle.getWomanHaveOrNoHaveGlass());
                        break;
                }
            }

        }

        for (String human : humanSex) {
            if (human.charAt(0) == 'm') {
                AbstractHuman humanMan = new HumanMan();
                humanMan.printAbountMe(humanAndGlass);
                break;
            } else {
                AbstractHuman humanWoman = new HumanWoman();
                humanWoman.printAbountMe(humanAndGlass);
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int counterForTables = -1;
        for (String sex : humanSex) {
            System.out.println("Enter index of tables (from 0 to 9), for human " + sex);
            int indexTables = scanner.nextInt();
            counterForTables++;
            if (!humanAndGlass.get(counterForTables).contains("not")) {
                switch (indexTables) {
                    case 0:
                        System.out.println(sex + " pour water on " + listOfTables.get(0));
                        table.setDry(false);
                        listOfTables.set(0, "table 1 is wet");
                        break;
                    case 1:
                        System.out.println(sex + " pour water on " + listOfTables.get(1));
                        table.setDry(false);
                        listOfTables.set(1, "table 2 is wet");
                        break;
                    case 2:
                        System.out.println(sex + " pour water on " + listOfTables.get(2));
                        table.setDry(false);
                        listOfTables.set(2, "table 3 is wet");
                        break;

                }

            }
        }
        table.isDry();

scanner.close();
    }
}
