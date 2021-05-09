package by.epamtc.jwd.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextDataScanner {
    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static String readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        StringBuilder text = new StringBuilder();

        while(scanner.hasNextLine()){
            text.append(scanner.nextLine());
        }

        return text.toString();
    }
}
