package by.epamtc.jwd.task7.run;

import by.epamtc.jwd.scanner.DataScanner;
import by.epamtc.jwd.task7.entity.PointPosition;
import by.epamtc.jwd.task7.unit.PositionLogic;

public class Runner {
    public static void main(String[] args) {
        PositionLogic positionAction = new PositionLogic();

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
        distanceA = positionAction.calculateDistanceToOrigin(x1, y1);
        distanceB = positionAction.calculateDistanceToOrigin(x2, y2);

        PointPosition state = positionAction.compareState(
                positionAction.calculateDistanceDifference(distanceA, distanceB));

        System.out.println(state.getState());
    }
}
