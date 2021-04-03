package by.epamtc.task10.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        double a, b, h;
        System.out.print("Введите границу вычисления a: ");
        a = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите границу вычисления b: ");
        b = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите шаг: ");
        h = by.epamtc.task10.unit.TrianleLogics.inputStep();

        by.epamtc.task10.unit.TrianleLogics.calculateFunction(a, b, h);
    }

    public static void printFunction(double x, double result) {
        System.out.printf("\n%.3f", x);
        System.out.printf("   %.3f", result);
    }
}
