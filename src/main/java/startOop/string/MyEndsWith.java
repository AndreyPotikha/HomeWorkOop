package startOop.string;

import java.util.Arrays;

public class MyEndsWith {

    public static void main(String[] args) {

//        System.out.println(myEndsWith("Пробуем проверит окончание предложения", "предложения"));
        System.out.println(mySplit("Я прохожу", "тему по работе с String"));
    }

    private static char[] mySplit(String line1, String line2) {
        line1 += " " + line2;
        char lineChar[] = line1.toCharArray();
        System.out.println(Arrays.toString(lineChar));
        return lineChar;
    }

    private static boolean myEndsWith(String line1, String line2) {
        char checkString[] = new char[line1.length()];
        char[] endLine = line2.toCharArray();
        int counter = 0;
        for (int i = line1.length() - 1; i >= 0; i--) {
            for (int j = endLine.length - 1; j >= 0; j--) {
                if (endLine[j] == line1.charAt(i)) {
                    counter++;
                    i--;
                    if (counter == line2.length()) {
                        return true;
                    }
                } else {
                    return false;
                }

            }
        }
        return false;
    }
}
