package startOop.oop.conditioners;

import java.util.List;

public class Conditioner {

    private static int temperature;

    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) { this.temperature = temperature; }

    public void getTurn(String conditioners) {
            System.out.println("Conditioner " + conditioners + " is off");
    }

    public void turnOn(List<Conditioner> conditioners) {
        temperature++;
        System.out.println(conditioners + " ON");
    }

    public void turnOff(String conditioners) {
        temperature = 0;
        System.out.println(conditioners + " OFF");
    }


}
