package startOop.oop.data.notepad;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Notepad {

    public ArrayList<Message> messages = new ArrayList<>();

    public void myAdd(GregorianCalendar date, String note) {
        Message message = new Message();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        message.setDate(simpleDateFormat.format(date.getTime()));
        message.setNote(note);
        messages.add(message);
    }

    public List<Message> printByDate(GregorianCalendar date) {
        List<Message> newMessages = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        String serchDate = simpleDateFormat.format(date.getTime());
        for (Message elem : messages) {
            if (serchDate.equals(elem.getDate())) {
                newMessages.add(elem);
            }
        }
        return newMessages;
    }

    @Data
    public class Message {
        String date;
        String note;
    }

}
