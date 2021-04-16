package by.epamtc.task7.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task7.entity.PointPosition;
import by.epamtc.task7.unit.PositionLogics;

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
        distanceA = PositionLogics.calculateDistanceToOrigin(x1, y1);
        distanceB = PositionLogics.calculateDistanceToOrigin(x2, y2);

        PointPosition state = PositionLogics.compareState(
                PositionLogics.calculateDistanceDifference(distanceA, distanceB));

        System.out.println(state.getState());
    }
}
