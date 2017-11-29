package startOop.oop.initialization;

public class DivInitial {
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
