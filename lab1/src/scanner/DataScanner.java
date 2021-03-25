package scanner;

import java.util.Scanner;

public class DataScanner {

    @SuppressWarnings("resource")
    public static double enterDoubleFromConsole() {

        Scanner sc = new Scanner(System.in);

        double a = 0.0;

        while (!sc.hasNextDouble()) {
            System.out.print("Некорректный ввод, введите double: ");
            sc.next();
        }

        a = sc.nextDouble();

        return a;
    }

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