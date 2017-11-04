package startOop.string;

public class ThreeLines {

    public static void main(String[] args) {
        System.out.println(twoLine("Гоголь"));
        System.out.println(oneLine("Опера"));
        System.out.println(anotherMethod("Третий"));

    }

    private static String twoLine(String line1) {
        String invertedLine = new StringBuffer(line1).reverse().toString();
            return invertedLine;
    }

    private static String oneLine(String line1) {
        char invertChar;
        for (int i = line1.length() - 1; i >= 0; i--) {
            invertChar = line1.charAt(i);
            line1 = line1 + invertChar;
        }
        line1 = line1.substring(line1.length() / 2, line1.length());
        return line1;
    }

    private static String anotherMethod(String line1) {
        char invertChar[] = line1.toCharArray();
        for (int i = line1.length() - 1; i >= 0; i--) {
            line1 += invertChar[i];
        }
        line1 = line1.substring(line1.length() / 2, line1.length());
        return line1;
    }
}
