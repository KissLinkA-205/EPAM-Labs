package by.epamtc.task10.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {
        double a, b, h;
        System.out.print("Введите границу вычисления a: ");
        a = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите границу вычисления b: ");
        b = DataScanner.enterDoubleFromConsole();

        do {
            System.out.print("Введите шаг: ");
            h = DataScanner.enterDoubleFromConsole();
        } while (h <= 0);

        double x = a, result;
        while (x <= b) {
            System.out.printf("\n%.3f", x);
            result = by.epamtc.task10.unit.TrianleLogics.calculatingTheTangent(x);
            System.out.printf("   %.3f", result);
            x = by.epamtc.task10.unit.TrianleLogics.addStep(x, h);
        }
    }
}
