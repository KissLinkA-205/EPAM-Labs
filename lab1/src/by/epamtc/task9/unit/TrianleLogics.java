package by.epamtc.task9.unit;

import by.epamtc.scanner.DataScanner;

public class TrianleLogics {
    public static double calculateLengthOfCircle(double radius) {
        double pi = java.lang.Math.PI;
        return 2 * pi * radius;
    }

    public static double calculateSquareOfCircle(double radius) {
        double pi = java.lang.Math.PI;
        return radius * radius * pi;
    }

    public static double inputRadious() {
        double radius;
        do {
            radius = DataScanner.enterDoubleFromConsole();
        } while (radius <= 0);

        return radius;
    }
}
