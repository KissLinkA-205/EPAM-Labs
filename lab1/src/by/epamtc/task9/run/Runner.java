package by.epamtc.task9.run;

import by.epamtc.task9.unit.CircleLogics;
import by.epamtc.task9.unit.InputLogics;

public class Runner {
    public static void main(String[] args) {

        double radius;
        System.out.print("Введите радиус круга: ");
        radius = InputLogics.inputRadius();

        double length, square;
        length = CircleLogics.calculateLengthOfCircle(radius);
        square = CircleLogics.calculateSquareOfCircle(radius);

        System.out.printf("Длина окружности: %.3f", length);
        System.out.printf("\nПлощадь круга: %.3f", square);
    }
}
