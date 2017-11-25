package startOop.oop.conditioners;

import java.util.LinkedList;
import java.util.List;

public class Conditioner {

    private static int temperature;
//    private static boolean onOff = false;

    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) { this.temperature = temperature; }

    public void getTurn(List<Conditioner> conditioner) {
        System.out.println(conditioner);
       /* if (conditioner == false) {
            System.out.println("Conditioner " + conditioner + " is off");
        } else {
            System.out.println("Conditioner " + conditioner + " is on");
        }*/
    }

    public static Conditioner turnOn(List<Conditioner> conditioner) {
        List<Conditioner> list = new LinkedList<>();
        list.addAll(conditioner);
        for (Conditioner elem : list) {
//            elem.getTurn;
        }
     /*   BlockConditioners blockConditioners = new BlockConditioners();
        blockConditioners.setNameOfConditioner(String.valueOf(conditioner.get(0)));
        blockConditioners.setOnOff("On");
        System.out.println(blockConditioners);
        conditioner.remove("off");
        conditioner.add(blockConditioners);
        System.out.println(conditioner);*/
        return Conditioner.turnOn(conditioner);
    }
   /* public void turnOff(String conditioners) {
//        boolean onOff = false;
        onOff = false;
        System.out.println(conditioners + " OFF");
    }
*/

}
