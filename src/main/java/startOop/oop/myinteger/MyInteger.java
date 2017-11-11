package startOop.oop.myinteger;

public class MyInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyInteger(int value) {
        this.value = value;
    }


    public MyInteger plus(MyInteger obj) {
        int summa = this.value + obj.getValue();
        MyInteger objRet = new MyInteger(summa);
        return objRet;
    }
}
