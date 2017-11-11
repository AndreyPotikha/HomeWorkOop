package startOop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

       /* LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate startOOP = LocalDate.of(2017, 10, 31);
        long day = ChronoUnit.DAYS.between(startOOP, now);
        System.out.println(day);*/
//        birthday();
        lisDate();

    }

    private static void lisDate() {
        List<LocalDate> dateList = new LinkedList<>();
        LocalDate now = LocalDate.now();
        LocalDate from = now.minusWeeks(1);
        LocalDate to = now.plusWeeks(1);
        int limit = to.getDayOfMonth() - from.getDayOfMonth();

        System.out.println(limit);

        for (int i = 0; i <= limit; i++) {
            dateList.add(from.plusDays(i));
        }
        System.out.println(dateList);

    }

    private static void workWithDate() {

        final LocalDate now = LocalDate.now();
        final LocalDate minusWeeks = now.minusWeeks(1);
        System.out.println(minusWeeks);
        System.out.println(now.isBefore(minusWeeks));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.YYYY");
        System.out.println(dateTimeFormatter.format(now));
        while (true) {
            final LocalDateTime time = LocalDateTime.now();
            System.out.println(time.getDayOfWeek()
                    + " "
                    + time.getHour()
                    + " "
                    + time.getMinute()
                    + " "
                    + time.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void birthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wens yous day of birthday?");
        int dayOfBirthay = scanner.nextInt();
        System.out.println("Wens yous mounth of birthday?");
        int mounthOfBirthay = scanner.nextInt();
        System.out.println("Wens yous year of birthday?");
        int yearOfBirthay = scanner.nextInt();
        LocalDate now = LocalDate.now();

        LocalDate yourBirthday = LocalDate.of(yearOfBirthay, mounthOfBirthay, dayOfBirthay);
        long days = ChronoUnit.DAYS.between(yourBirthday, now);
        System.out.println(days);
    }
}
