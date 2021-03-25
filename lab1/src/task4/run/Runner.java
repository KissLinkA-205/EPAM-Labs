package task4.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        int A, B, C, D;
        System.out.print("Введите число A: ");
        A = DataScanner.enterIntFromConsole();

        System.out.print("Введите число B: ");
        B = DataScanner.enterIntFromConsole();

        System.out.print("Введите число C: ");
        C = DataScanner.enterIntFromConsole();

        System.out.print("Введите число D: ");
        D = DataScanner.enterIntFromConsole();

        boolean result = task4.unit.TrianleLogics.parity(A, B, C, D);

        if (result) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
