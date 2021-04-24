package by.epamtc.task3.unit;

public class CalculationLogic {
    public double calculateSquare(double size) {
        return size * size;
    }

    public double calculateSideAcrossDiagonal(double diagonal) {
        return diagonal / java.lang.Math.sqrt(2);
    }

    public double calculateSideOfSquare(double square) {
        return java.lang.Math.sqrt(square);
    }

    public double calculateSquareAttitude(double square1, double square2) {
        return square1 / square2;
    }
}
