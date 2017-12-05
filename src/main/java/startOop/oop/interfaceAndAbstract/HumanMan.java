package startOop.oop.interfaceAndAbstract;

import startOop.oop.interfaceAndAbstract.abstractClass.AbstractGlass;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractHuman;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractTable;
import startOop.oop.interfaceAndAbstract.impl.Humnable;

public class HumanMan extends AbstractHuman implements Humnable {

    private String manHaveOrNoHaveGlass = "";

    public String getManHaveOrNoHaveGlass() {
        return manHaveOrNoHaveGlass;
    }
    public void setManHaveOrNoHaveGlass(String manHaveOrNoHaveGlass) {
        this.manHaveOrNoHaveGlass = manHaveOrNoHaveGlass;
    }

    public String sexMan() {
        String sexMan = "man";
        return sexMan;
    }

    @Override
    public void takeGlass(AbstractGlass glass) {
        if (glass instanceof GlassSquare) {
            int counter = (int) (Math.random() * 2 + 1);
            switch (counter) {
                case 1:
                    manHaveOrNoHaveGlass = "have a square glass";
                    break;
                case 2:
                    manHaveOrNoHaveGlass = "not have a glass";
                    break;
            }
        } else {
            int counter = (int) (Math.random() * 2 + 1);
            switch (counter) {
                case 1:
                    manHaveOrNoHaveGlass = "have a circle glass";
                    break;
                case 2:
                    manHaveOrNoHaveGlass = "not have a glass";
                    break;
            }
        }

    }

    @Override
    public void putGlass() {

    }

    @Override
    public void pourWaterOnTabe(AbstractTable table) {

    }

    @Override
    public void fillGlass() {

    }

}
