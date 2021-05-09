package by.epamtc.jwd.logic;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.entity.plane.Freighter;
import by.epamtc.jwd.entity.plane.PassengerPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirlineLogic {
    public void sortPlanes(Airline airline, Comparator<AbstractPlane> comparator) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        List<AbstractPlane> planes = airline.getPlanes();

        planes.sort(comparator);
    }

    public double calculateTotalCarryingCapacity(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        double result = 0;
        List<Freighter> planes = selectFreighters(airline);
        for (Freighter plane : planes) {
            result += plane.getCarryingCapacity();
        }

        return result;
    }

    public double calculateTotalPassengerSeats(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        double result = 0;
        List<PassengerPlane> planes = selectPassengerPlanes(airline);
        for (PassengerPlane plane : planes) {
            result += plane.getPassengerSeats();
        }

        return result;
    }

    public List<Freighter> selectFreighters(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        List<AbstractPlane> planes = airline.getPlanes();
        List<Freighter> freighters = new ArrayList<>();

        for (AbstractPlane plane : planes) {
            if (plane instanceof Freighter) {
                freighters.add((Freighter) plane);
            }
        }
        return freighters;
    }

    public List<PassengerPlane> selectPassengerPlanes(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }

        List<AbstractPlane> planes = airline.getPlanes();
        List<PassengerPlane> passengerPlanes = new ArrayList<>();

        for (AbstractPlane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }

        }
        return passengerPlanes;
    }
}
