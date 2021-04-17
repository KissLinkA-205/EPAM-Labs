package by.epamtc.task9.run;

import by.epamtc.task9.unit.CircleLogics;
import by.epamtc.task9.unit.InputLogics;

public class Runner {
    public static void main(String[] args) {
        InputLogics input = new InputLogics();
        CircleLogics circleAction = new CircleLogics();

        double radius;
        System.out.print("Введите радиус круга: ");
        radius = input.inputRadius();

        double length, square;
        length = circleAction.calculateLengthOfCircle(radius);
        square = circleAction.calculateSquareOfCircle(radius);

        System.out.printf("Длина окружности: %.3f", length);
        System.out.printf("\nПлощадь круга: %.3f", square);
    }
}
