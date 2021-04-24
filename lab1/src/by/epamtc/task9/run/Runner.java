package by.epamtc.task9.run;

import by.epamtc.task9.unit.CircleLogic;
import by.epamtc.task9.unit.InputLogic;

public class Runner {
    public static void main(String[] args) {
        InputLogic input = new InputLogic();
        CircleLogic circleAction = new CircleLogic();

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
