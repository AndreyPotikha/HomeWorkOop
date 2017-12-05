package startOop.oop.interfaceAndAbstract;

import startOop.oop.interfaceAndAbstract.abstractClass.AbstractGlass;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractHuman;
import startOop.oop.interfaceAndAbstract.abstractClass.AbstractTable;
import startOop.oop.interfaceAndAbstract.impl.Humnable;

public class HumanWoman extends AbstractHuman implements Humnable {

    private String womanHaveOrNoHaveGlass = "";

    public String getWomanHaveOrNoHaveGlass() {
        return womanHaveOrNoHaveGlass;
    }
    public void setWomanHaveOrNoHaveGlass(String womanHaveOrNoHaveGlass) {
        this.womanHaveOrNoHaveGlass = womanHaveOrNoHaveGlass;
    }


    public String sexWoman() {
        String sexMan = "woman";
        return sexMan;
    }

    @Override
    public void takeGlass(AbstractGlass glass) {
        if (glass instanceof GlassSquare) {
            int counter = (int) (Math.random() * 2 + 1);
            switch (counter) {
                case 1:
                    womanHaveOrNoHaveGlass = "have a square glass";
                    break;
                case 2:
                    womanHaveOrNoHaveGlass = "not have a glass";
                    break;
            }
        } else {
            int counter = (int) (Math.random() * 2 + 1);
            switch (counter) {
                case 1:
                    womanHaveOrNoHaveGlass = "have a circle glass";
                    break;
                case 2:
                    womanHaveOrNoHaveGlass = "not have a glass";
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
