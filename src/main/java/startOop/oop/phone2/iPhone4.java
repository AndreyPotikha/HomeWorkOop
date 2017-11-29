package startOop.oop.phone2;

import java.util.LinkedList;
import java.util.List;

public class iPhone4 extends iPhone {

    public List<Phone> iphon4() {
        List<Phone> phones = new LinkedList<>();
        Phone phone = new iPhone4();
        phone.setName("iPhone4");
        phone.setNumber("3");
        phone.setCamera(true);
        phone.setSideSize(4);
        ((iPhone)phone).setAppleid(999);
        phones.add(phone);
        return phones;
    }

    @Override
    public void call(List<Phone> phone) {
        List<Phone> phones = iphon4();
        System.out.println("Звоним с - " + phones + ", на - " + phone);
    }
}
