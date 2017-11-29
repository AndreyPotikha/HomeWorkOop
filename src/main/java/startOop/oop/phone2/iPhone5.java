package startOop.oop.phone2;

import java.util.LinkedList;
import java.util.List;

public class iPhone5 extends iPhone {

    public List<Phone> iphon5() {
        List<Phone> phones = new LinkedList<>();
        Phone phone = new iPhone5();
        phone.setName("iPhone5");
        phone.setNumber("4");
        phone.setCamera(true);
        phone.setSideSize(5);
        ((iPhone)phone).setAppleid(888999);
        phones.add(phone);
        return phones;
    }

    @Override
    public void call(List<Phone> phone) {
        List<Phone> phones = iphon5();
        System.out.println("Звоним с - " + phones + ", на - " + phone);
    }
}
