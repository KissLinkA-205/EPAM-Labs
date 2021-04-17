package by.epamtc.task3.run;

import by.epamtc.task3.unit.CalculationLogics;
import by.epamtc.task3.unit.InputLogics;

public class Runner {
    public static void main(String[] args) {
        InputLogics input = new InputLogics();
        CalculationLogics calculate = new CalculationLogics();

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
