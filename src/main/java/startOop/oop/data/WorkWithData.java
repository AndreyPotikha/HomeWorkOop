package startOop.oop.data;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WorkWithData {

    public static void main(String[] args) {

        Date currentDate = new Date();
        Calendar currentTime = new GregorianCalendar();
        Calendar time2017 = new GregorianCalendar(2017, 12, 16);

        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("День dd Месяц MM год yyyy Время hh:mm");
        SimpleDateFormat format3 = new SimpleDateFormat("dd MM yyyy");

        System.out.println("Date: " + currentDate);
        System.out.println("GregorianCalendar1: " + currentTime);
        System.out.println("GregorianCalendar2: " + time2017);
        System.out.println();

        System.out.println("1: " + format1.format(currentDate));
        System.out.println("2: " + format2.format(currentTime.getTime()));
        System.out.println("3: " + format3.format(time2017.getTime()));
        System.out.println();

        System.out.println("FirstDayOfWeak = " + currentTime.getFirstDayOfWeek());
        System.out.println("TimeZone = " + currentTime.getTimeZone());
        System.out.println("Day of weak = " + Calendar.DAY_OF_WEEK);
        System.out.println("Day of month = " + Calendar.DAY_OF_MONTH);
        System.out.println("December = " + currentTime.DECEMBER);
        System.out.println();

        currentTime.add(Calendar.DAY_OF_YEAR, 1);
        System.out.println(format1.format(currentTime.getTime()));
        currentTime.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println(format1.format(currentTime.getTime()));
    }
}
