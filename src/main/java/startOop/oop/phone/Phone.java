package startOop.oop.phone;

public class Phone {

    private static Phone[] phones = new Phone[10];
    private String myNumber;
    private String marka;

    @Override
    public String toString() {
        return "Phone"
                + " number "
                + myNumber
                + " mark of phone "
                + marka;
    }


    public static Phone[] getPhones() {
        return phones;
    }
    public static void setPhones(Phone[] phones) {
        Phone.phones = phones;
    }


    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public Phone(String myNumber, String marka) {
        this.myNumber = myNumber;
        this.marka = marka;
    }

    public Phone() {
    }

    public String getMyNumber() {
        return myNumber;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Phone(String myNumber) {
        this.myNumber = myNumber;
    }

}
