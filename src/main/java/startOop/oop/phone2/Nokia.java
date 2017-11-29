package startOop.oop.phone2;

import java.util.LinkedList;
import java.util.List;

public class Nokia extends Phone {

    public List<Phone> nokia() {
        List<Phone> phones = new LinkedList<>();
        Phone phone = new Nokia();
        phone.setName("Nokia");
        phone.setNumber("1");
        phone.setCamera(false);
        phone.setSideSize(4);
        phones.add(phone);
        return phones;
    }

    @Override
    public void call(List<Phone> phone) {
        List<Phone> phones = nokia();
        System.out.println("Звоним с - " + phones + ", на - " + phone);
    }
}
