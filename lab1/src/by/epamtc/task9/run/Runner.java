package by.epamtc.task9.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        double radius;
        do {
            System.out.print("Введите радиус круга: ");
            radius = DataScanner.enterDoubleFromConsole();
        } while (radius <= 0);

        double length, square;
        length = by.epamtc.task9.unit.TrianleLogics.lengthOfCircle(radius);
        square = by.epamtc.task9.unit.TrianleLogics.squareOfCircle(radius);

        System.out.print("Длина окружности: " + length);
        System.out.print("\nПлощадь круга: " + square);
    }
}
