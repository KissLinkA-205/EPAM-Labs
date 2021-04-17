package by.epamtc.scanner;

import java.util.Scanner;

public class DataScanner {
    public static int enterIntFromConsole() {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (!sc.hasNextInt()) {
            System.out.print("Некорректный ввод, введите int: ");
            sc.next();
        }
        a = sc.nextInt();

        return a;
    }
}