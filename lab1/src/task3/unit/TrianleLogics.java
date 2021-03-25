package task3.unit;

import static java.lang.Math.sqrt;

public class TrianleLogics {
    public static double calculationSquare(double size) {
        return size * size;
    }

    public static double sideOfDiagonal(double diagonal) {
        return diagonal / sqrt(2);
    }

    public static double sideOfSquare(double square) {
        return sqrt(square);
    }

    public static double squareAttitude(double square1, double square2) {
        return square1 / square2;
    }
}
