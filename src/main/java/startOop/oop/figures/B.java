package startOop.oop.figures;

public class B extends A {
    public B() {
    }

    {
        System.out.println("Не статик(Б)");
    }

    static {
        System.out.println("Статика(Б)");
    }
}
