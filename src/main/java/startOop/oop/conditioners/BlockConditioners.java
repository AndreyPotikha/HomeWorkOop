package startOop.oop.conditioners;

import java.util.ArrayList;
import java.util.List;

public class BlockConditioners extends Conditioner{

    String nameOfConditioner;

    public String getNameOfConditioner() {
        return nameOfConditioner;
    }

    public void setNameOfConditioner(String nameOfConditioner) {
        this.nameOfConditioner = nameOfConditioner;
    }

    public List<Conditioner> condotioners() {
        List<Conditioner> condit = new ArrayList<>();
        BlockConditioners block = new BlockConditioners();
        block.setNameOfConditioner("CuperCinter");
        block.setNameOfConditioner("Samsing");
        condit.add(block);
        return condit;
    }
}
