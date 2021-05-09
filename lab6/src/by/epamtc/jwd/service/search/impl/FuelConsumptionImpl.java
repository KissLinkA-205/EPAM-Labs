package by.epamtc.jwd.service.search.impl;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;
import by.epamtc.jwd.service.search.SearchService;

import java.util.ArrayList;
import java.util.List;

public class FuelConsumptionImpl implements SearchService {
    @Override
    public List<AbstractPlane> searchPlane(Airline airline, double lowerConsumption, double upperConsumption) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }

        List<AbstractPlane> planes = airline.getPlanes();
        List<AbstractPlane> result = new ArrayList<>();

        for (AbstractPlane plane : planes) {
            if (plane.getFuelConsumption() >= lowerConsumption && plane.getFuelConsumption() <= upperConsumption) {
                result.add(plane);
            }
        }
        return result;
    }
}
