package by.epamtc.task3.run;

import by.epamtc.task3.unit.CalculateLogics;
import by.epamtc.task3.unit.InputLogics;

public class Runner {
    public static void main(String[] args) {

        double square1;
        System.out.print("Введите площать исходного квадрата: ");
        square1 = InputLogics.inputSquare();

        double diagonal;
        diagonal = CalculateLogics.calculateSideOfSquare(square1);

        double side;
        side = CalculateLogics.calculateSideAcrossDiagonal(diagonal);

        double square2;
        square2 = CalculateLogics.calculateSquare(side);
        System.out.printf("Площать полученного квадрата: %.3f", square2);

        double attitude;
        attitude = CalculateLogics.calculateSquareAttitude(square1, square2);
        System.out.printf("\nОтношение площадей: %.3f", attitude);
    }
}
