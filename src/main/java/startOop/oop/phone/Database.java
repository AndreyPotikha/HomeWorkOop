package startOop.oop.phone;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<Phone> basePhone() {
        LinkedList<Phone> phopes = new LinkedList<Phone>();
        Phone phone1 = new Phone();
        phone1.setMyNumber("+380501234568");
        phone1.setMarka("Motorola");
        phopes.add(phone1);
        Phone phone2 = new Phone();
        phone2.setMyNumber("+380501234569");
        phone2.setMarka("iPhon");
        phopes.add(phone2);
        Phone phone3 = new Phone();
        phone3.setMyNumber("+380501234570");
        phone3.setMarka("Samsung");
        phopes.add(phone3);
        Phone phone4 = new Phone();
        phone4.setMyNumber("+380501234571");
        phone4.setMarka("Xiaomi");
        phopes.add(phone4);
        Phone phone5 = new Phone();
        phone5.setMyNumber("+380501234572");
        phone5.setMarka("Nokia");
        phopes.add(phone5);
        Phone phone = new Phone();
        return phopes;

    }
}
