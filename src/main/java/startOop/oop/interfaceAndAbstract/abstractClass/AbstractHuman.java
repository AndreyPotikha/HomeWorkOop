package startOop.oop.interfaceAndAbstract.abstractClass;

import startOop.oop.interfaceAndAbstract.impl.Humnable;

import java.util.List;

public abstract class AbstractHuman implements Humnable{

    @Override
    public void printAbountMe(List<String> human) {
        for (String humanAndGlass : human) {
            System.out.println(humanAndGlass);
        }
    }
}
