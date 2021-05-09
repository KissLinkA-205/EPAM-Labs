package by.epamtc.jwd.task3.run;

import by.epamtc.jwd.task3.unit.CalculationLogic;
import by.epamtc.jwd.task3.unit.InputLogic;

public class Runner {
    public static void main(String[] args) {
        InputLogic input = new InputLogic();
        CalculationLogic calculate = new CalculationLogic();

        double square1;
        System.out.print("Введите площать исходного квадрата: ");
        square1 = input.inputSquare();

        double diagonal;
        diagonal = calculate.calculateSideOfSquare(square1);

        double side;
        side = calculate.calculateSideAcrossDiagonal(diagonal);

        double square2;
        square2 = calculate.calculateSquare(side);
        System.out.printf("Площать полученного квадрата: %.3f", square2);

        double attitude;
        attitude = calculate.calculateSquareAttitude(square1, square2);
        System.out.printf("\nОтношение площадей: %.3f", attitude);
    }
}
