package by.epamtc.task9.run;

public class Runner {
    public static void main(String[] args) {

        double radius;
        System.out.print("Введите радиус круга: ");
        radius = by.epamtc.task9.unit.TrianleLogics.inputRadious();

        double length, square;
        length = by.epamtc.task9.unit.TrianleLogics.calculateLengthOfCircle(radius);
        square = by.epamtc.task9.unit.TrianleLogics.calculateSquareOfCircle(radius);

        System.out.printf("Длина окружности: %.3f", length);
        System.out.printf("\nПлощадь круга: %.3f", square);
    }
}
