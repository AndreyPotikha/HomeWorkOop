package startOop;

public class Equals {

    public static void main(String[] args) {
        System.out.println(myEquals("Привет", "Привет"));
    }

    private static boolean myEquals(String line1, String line2) {
        char charForLine1[] = line1.toCharArray();
        char charForLine2[] = line2.toCharArray();
        int counter = 0;
        if (line1.length() == line2.length()) {
            for (int i = 0; i < line1.length(); i++) {
                if (charForLine1[i] == charForLine2[i]) {
                    counter++;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        if (counter == line1.length()) {
            return true;
        }
        return false;
    }
}
