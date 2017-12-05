package startOop.oop.interfaceAndAbstract.impl;

import startOop.oop.interfaceAndAbstract.abstractClass.AbstractGlass;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractTable;

import java.util.List;

public interface Humnable {
    public void takeGlass(AbstractGlass glass);
    public void putGlass();
    public void pourWaterOnTabe(AbstractTable table);
    public void fillGlass();
    public void printAbountMe(List<String> human);
}
