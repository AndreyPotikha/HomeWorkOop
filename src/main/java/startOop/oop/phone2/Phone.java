package startOop.oop.phone2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Phone {
    private String number;
    private boolean camera;
    private int sideSize;
    private String name;

    @Override
    public String toString() {
        return "number - " + number + '\'' +
                ", camera - " + camera +
                ", sideSize - " + sideSize +
                ", name - " + name + '\'' + "apple id - ";
    }

    public abstract void call(List<Phone> phone);

}
