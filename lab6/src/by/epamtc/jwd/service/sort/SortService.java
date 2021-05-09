package by.epamtc.jwd.service.sort;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;

import java.util.Comparator;

public interface SortService {
    void sortPlanes(Airline airline, Comparator<AbstractPlane> comparator) throws EmptyPlaneException;
}