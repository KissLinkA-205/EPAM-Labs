package by.epamtc.task10.unit;

import by.epamtc.scanner.DataScanner;

public class TrianleLogics {
    public static void calculateFunction(double a, double b, double h) {
        double x = a, result;
        while (x <= b) {
            result = by.epamtc.task10.unit.TrianleLogics.calculateTangent(x);
            by.epamtc.task10.run.Runner.printFunction(x, result);
            x = by.epamtc.task10.unit.TrianleLogics.addStep(x, h);
        }
    }

    public static double calculateTangent(double x) {
        return java.lang.Math.tan(x);
    }

    public static double addStep(double x, double h) {
        return x + h;
    }

    public static double inputStep() {
        double h;
        do {
            h = DataScanner.enterDoubleFromConsole();
        } while (h <= 0);

        return h;
    }
}
