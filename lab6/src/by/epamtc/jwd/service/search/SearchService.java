package by.epamtc.jwd.service.search;

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;

import java.util.List;

public interface SearchService {
    List<AbstractPlane> searchPlane(Airline airline, double lowerParameter, double upperParameter) throws EmptyPlaneException;
}
