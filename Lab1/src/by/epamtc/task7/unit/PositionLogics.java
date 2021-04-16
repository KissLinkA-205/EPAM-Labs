package by.epamtc.task7.unit;

import by.epamtc.task7.entity.PointPosition;

public class PositionLogics {
    public static double calculateDistanceToOrigin(double x, double y) {
        return java.lang.Math.sqrt(x * x + y * y);
    }

    public static double calculateDistanceDifference(double distance1, double distance2) {
        double result;
        result = distance1 - distance2;
        return result;
    }

    public static PointPosition compareState(double distanceDifference) {
        PointPosition state = PointPosition.DESTINATION_IS_THE_SAME;
        if(distanceDifference > 0) {
            state = PointPosition.SECOND_POINT_IS_CLOSER;
        } else if(distanceDifference < 0) {
            state = PointPosition.FIRST_POINT_IS_CLOSER;
        }

        return state;
    }
}
