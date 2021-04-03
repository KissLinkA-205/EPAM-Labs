package by.epamtc.task7.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task7.entity.PointPosition;

public class Runner {
    public static void main(String[] args) {

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
        distanceA = by.epamtc.task7.unit.TrianleLogics.calculateDistanceToOrigin(x1, y1);
        distanceB = by.epamtc.task7.unit.TrianleLogics.calculateDistanceToOrigin(x2, y2);

        PointPosition state = by.epamtc.task7.unit.TrianleLogics.сompareState(
                by.epamtc.task7.unit.TrianleLogics.calculateDistanceDifference(distanceA, distanceB));

        System.out.println(state.getState());
    }
}
