package startOop;

import java.util.Scanner;

public class acceptReturn {

    public static void main(String[] args) {
//        stringWord();
//        charWord();
        lestIndex("Слово", 'л');

    }

    private static String stringWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        System.out.println(word);
        return word;
    }

    private static char charWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 символ");
        String word = scanner.nextLine();
        char returtWord = word.charAt(0);
        System.out.println(returtWord);
        return returtWord;
    }

    private static int lestIndex(String line, char letter) {
        int number = line.indexOf(letter);
        System.out.println(number);
        return number;
    }
}
