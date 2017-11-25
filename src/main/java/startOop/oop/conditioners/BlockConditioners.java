package startOop.oop.conditioners;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class BlockConditioners extends Conditioner{

    private String nameOfConditioner;
    private String onOff = "off";

    @Override
    public String toString() {
        return nameOfConditioner + " " + onOff;
    }


    public  List<Conditioner> cupperHanter() {
        BlockConditioners conditioners = new BlockConditioners();
        List<Conditioner> conditioner = new LinkedList<>();
        conditioners.setNameOfConditioner("CupperHanter");
        conditioners.setOnOff("off");
        conditioner.add(conditioners);
        return conditioner;
    }
    public Conditioner samsung() {
        BlockConditioners conditioners = new BlockConditioners();
        conditioners.setNameOfConditioner("Samsung");
        return conditioners;
    }
    public String lG() {
        return nameOfConditioner = "LG";
    }
    public String toshiba() {
        return nameOfConditioner = "Toshiba";
    }


}
