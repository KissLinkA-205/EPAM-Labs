package by.epamtc.jwd.logic;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.entity.plane.Freighter;
import by.epamtc.jwd.entity.plane.PassengerPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;

import java.util.List;

public class AirlineLogic {
    public double calculateTotalCarryingCapacity(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        double result = 0;
        List<AbstractPlane> planes = airline.getPlanes();
        for (AbstractPlane plane : planes) {
            if (plane instanceof Freighter) {
                result += plane.getSpecialParameter();
            }
        }

        return result;
    }

    public double calculateTotalPassengerSeats(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        double result = 0;
        List<AbstractPlane> planes = airline.getPlanes();
        for (AbstractPlane plane : planes) {
            if (plane instanceof PassengerPlane) {
                result += plane.getSpecialParameter();
            }
        }

        return result;
    }
}
