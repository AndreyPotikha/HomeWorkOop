package startOop.oop.initialization;

public class DivInitial {

    static String name = "Andrey";
    String surname = "Potikha";

    {
        System.out.println("Блок инициализиции");
    }
   static  {
        System.out.println("static Блок инициализации");
    }

    public DivInitial() {
        System.out.println("Конструктор");
    }
}
