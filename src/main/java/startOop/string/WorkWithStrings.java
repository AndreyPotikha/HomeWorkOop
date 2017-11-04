package startOop.string;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithStrings {

    public static void main(String[] args) {
        countWord();

    }

    private static void countWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую фразу");
        String phrase = scanner.nextLine();
        String words[] = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        scanner.close();

    }
}
