package startOop.oop.phone2;

import java.util.LinkedList;
import java.util.List;

public class Samsung extends Phone {

    public List<Phone> samsung() {
        List<Phone> phones = new LinkedList<>();
        Phone phone = new Nokia();
        phone.setName("Samsung");
        phone.setNumber("2");
        phone.setCamera(true);
        phone.setSideSize(6);
        phones.add(phone);
        return phones;
    }

    @Override
    public void call(List<Phone> phone) {
        List<Phone> phones = samsung();
        System.out.println("Звоним с - " + phones + ", на - " + phone);
    }
}
