package by.epamtc.jwd.task7.unit;

import by.epamtc.jwd.task7.entity.PointPosition;

public class PositionLogic {
    public double calculateDistanceToOrigin(double x, double y) {
        return java.lang.Math.sqrt(x * x + y * y);
    }

    public double calculateDistanceDifference(double distance1, double distance2) {
        double result;
        result = distance1 - distance2;
        return result;
    }

    public PointPosition compareState(double distanceDifference) {
        PointPosition state = PointPosition.DESTINATION_IS_THE_SAME;
        if(distanceDifference > 0) {
            state = PointPosition.SECOND_POINT_IS_CLOSER;
        } else if(distanceDifference < 0) {
            state = PointPosition.FIRST_POINT_IS_CLOSER;
        }

        return state;
    }
}
