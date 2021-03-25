package task3.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        double square1;
        do {
            System.out.print("Введите площать исходного квадрата: ");
            square1 = DataScanner.enterDoubleFromConsole();
        } while (square1 <= 0);

        double diagonal;
        diagonal = task3.unit.TrianleLogics.sideOfSquare(square1);

        double side;
        side = task3.unit.TrianleLogics.sideOfDiagonal(diagonal);

        double square2;
        square2 = task3.unit.TrianleLogics.calculationSquare(side);
        System.out.printf("Площать полученного квадрата: %.3f", square2);

        double attitude;
        attitude = task3.unit.TrianleLogics.squareAttitude(square1, square2);
        System.out.printf("\nОтношение площадей: %.3f", attitude);
    }
}
