package by.epamtc.task4.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {

        int A, B, C, D;
        System.out.print("Введите число A: ");
        A = DataScanner.enterIntFromConsole();

        System.out.print("Введите число B: ");
        B = DataScanner.enterIntFromConsole();

        System.out.print("Введите число C: ");
        C = DataScanner.enterIntFromConsole();

        System.out.print("Введите число D: ");
        D = DataScanner.enterIntFromConsole();

        boolean result = by.epamtc.task4.unit.TrianleLogics.isParity(A, B, C, D);
        System.out.print(result);
    }
}
