package startOop.oop.workWithFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class readerFile {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("d://book//dyrectory.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while (scanner.hasNextLine()) {
            i++;
            System.out.println("строка с номером " + i + ":" + scanner.nextLine());
        }
        scanner.close();
    }
}
