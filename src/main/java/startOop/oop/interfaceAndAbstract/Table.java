package startOop.oop.interfaceAndAbstract;

import startOop.oop.interfaceAndAbstract.abstractClass.AbstractTable;
import startOop.oop.interfaceAndAbstract.impl.Tableble;

import java.util.List;

public class Table extends AbstractTable implements Tableble {

    private boolean dry = true;
    private String dryOrNo = "dry";

    public String getDryOrNo() {
        return dryOrNo;
    }

    public void setDryOrNo(String dryOrNo) {
        this.dryOrNo = dryOrNo;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }

    @Override
    public boolean isDry() {
        List<String> listOfTables = MainClass.listOfTables;
        System.out.println(listOfTables);
        return dry;
    }
}
