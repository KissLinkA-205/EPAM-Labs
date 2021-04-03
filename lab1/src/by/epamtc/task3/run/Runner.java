package by.epamtc.task3.run;

public class Runner {
    public static void main(String[] args) {

        double square1;
        System.out.print("Введите площать исходного квадрата: ");
        square1 = by.epamtc.task3.unit.TrianleLogics.inputSquare();

        double diagonal;
        diagonal = by.epamtc.task3.unit.TrianleLogics.calculateSideOfSquare(square1);

        double side;
        side = by.epamtc.task3.unit.TrianleLogics.calculateSideAcrossDiagonal(diagonal);

        double square2;
        square2 = by.epamtc.task3.unit.TrianleLogics.calculateSquare(side);
        System.out.printf("Площать полученного квадрата: %.3f", square2);

        double attitude;
        attitude = by.epamtc.task3.unit.TrianleLogics.calculateSquareAttitude(square1, square2);
        System.out.printf("\nОтношение площадей: %.3f", attitude);
    }
}
