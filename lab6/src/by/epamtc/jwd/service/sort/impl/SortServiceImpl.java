package by.epamtc.jwd.service.sort.impl;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;
import by.epamtc.jwd.service.sort.SortService;

import java.util.Comparator;
import java.util.List;

public class SortServiceImpl implements SortService {
    @Override
    public void sortPlanes(Airline airline, Comparator<AbstractPlane> comparator) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("Planes are empty");
        }
        List<AbstractPlane> planes = airline.getPlanes();

        planes.sort(comparator);
    }
}
