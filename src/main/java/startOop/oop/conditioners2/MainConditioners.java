package startOop.oop.conditioners2;

import java.util.List;

public class MainConditioners {

    public static void main(String[] args) {
        BlockConditioners blockConditioners = new BlockConditioners();
        blockConditioners.create();

        final List<Conditioner> conditionerList = blockConditioners.getConditionerList();
        for (Conditioner elem : conditionerList) {
            System.out.println(elem);
        }
        blockConditioners.getOff(conditionerList.get(0));
        blockConditioners.getOff(conditionerList.get(1));
        System.out.println(blockConditioners.getConditionerList());
        blockConditioners.getOn(conditionerList.get(0));
        System.out.println(blockConditioners.getConditionerList());

    }


}
