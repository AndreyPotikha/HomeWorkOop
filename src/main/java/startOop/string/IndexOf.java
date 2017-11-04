package startOop.string;

public class IndexOf {

    public static void main(String[] args) {
        System.out.println(MyIndexOf("Я люблю Java", "люблю"));
    }

    private static int MyIndexOf(String line1, String line2) {
        int index = 5;
        int counter = 0;
        char invrtChar[] = line2.toCharArray();
        for (int i = 0; i < line1.length(); i++) {
            if (invrtChar[0] == line1.charAt(i)) {
                for (int j = 0; j < line2.length(); j++) {
                    if (invrtChar[j] == line1.charAt(i)) {
                        i++;
                        counter++;
                        if (counter == line2.length()) {
                            return index = i - line2.length();
                        }
                    }
                }
            }
        }
        return 0;
    }
}
