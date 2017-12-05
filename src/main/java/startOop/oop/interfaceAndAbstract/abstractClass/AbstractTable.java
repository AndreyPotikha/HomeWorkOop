package startOop.oop.interfaceAndAbstract.abstractClass;

import startOop.oop.interfaceAndAbstract.Table;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTable {

    public List<String> listOfTable() {

        Table tables = new Table();
        List<String> table = new ArrayList<>();
        table.add("table1 ");
        table.add("table2 ");
        table.add("table3 ");
        return table;
    }


}
