package startOop.oop.data.notepad;

import java.util.GregorianCalendar;

public class NotepadMain {

    public static void main(String[] args) {

        Notepad notepad = new Notepad();
        GregorianCalendar date1 = new GregorianCalendar(2017, 1, 20);
        GregorianCalendar date2 = new GregorianCalendar(2017, 2, 21);
        notepad.myAdd(date1, "Первая строка");
        notepad.myAdd(date1, "Вторая строка");
        notepad.myAdd(date2, "Третья строка");
        System.out.println(notepad.printByDate(date1));
    }
}
