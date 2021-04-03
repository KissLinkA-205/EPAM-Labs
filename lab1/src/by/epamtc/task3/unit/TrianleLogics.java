package by.epamtc.task3.unit;

import by.epamtc.scanner.DataScanner;

public class TrianleLogics {
    public static double calculateSquare(double size) {
        return size * size;
    }

    public static double calculateSideAcrossDiagonal(double diagonal) {
        return diagonal / java.lang.Math.sqrt(2);
    }

    public static double calculateSideOfSquare(double square) {
        return java.lang.Math.sqrt(square);
    }

    public static double calculateSquareAttitude(double square1, double square2) {
        return square1 / square2;
    }

    public static double inputSquare() {
        double square;
        do {
            square = DataScanner.enterDoubleFromConsole();
        } while (square <= 0);

        return square;
    }
}
