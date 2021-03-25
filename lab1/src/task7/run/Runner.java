package task7.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        double x1, y1, x2, y2;
        System.out.print("Введите координату x точки A: ");
        x1 = DataScanner.enterDoubleFromConsole();
        System.out.print("Введите координату y точки A: ");
        y1 = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите координату x точки B: ");
        x2 = DataScanner.enterDoubleFromConsole();
        System.out.print("Введите координату y точки B: ");
        y2 = DataScanner.enterDoubleFromConsole();

        double distanceA, distanceB;
        distanceA = task7.unit.TrianleLogics.distanceToOrigin(x1, y1);
        distanceB = task7.unit.TrianleLogics.distanceToOrigin(x2, y2);
        if (distanceA < distanceB) {
            System.out.print("Точка A находится ближе к началу координат");
        } else if (distanceB < distanceA) {
            System.out.print("Точка B находится ближе к началу координат");
        } else {
            System.out.print("Точки равноудалены от начала координат");
        }
    }
}
