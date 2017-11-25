package startOop.oop.conditioners2;

import java.util.LinkedList;
import java.util.List;

public class BlockConditioners extends Conditioner {

    private List<Conditioner> conditionerList = new LinkedList<>();

    public void create() {
        final Conditioner appleConditioner = new Conditioner();
        appleConditioner.setName("Apple");
        appleConditioner.setStatus("On");
        final Conditioner huaweiConditioner = new Conditioner();
        huaweiConditioner.setName("Apple");
        huaweiConditioner.setStatus("On");
        conditionerList.add(appleConditioner);
        conditionerList.add(huaweiConditioner);
    }
    public void turnOff(Conditioner conditioner) {
        conditioner.setStatus("Off");
    }
    public void turnOn(Conditioner conditioner) {
        conditioner.setStatus("On");
    }
    public List<Conditioner> getConditionerList() {
        return conditionerList;
    }
}
