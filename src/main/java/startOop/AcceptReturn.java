package startOop;

import java.util.Scanner;

public class AcceptReturn {

    public static void main(String[] args) {
//        stringWord();
//        charWord();
        System.out.println(lestIndex("Слон", 'л'));

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
        return line.indexOf(letter);
        }
    }

