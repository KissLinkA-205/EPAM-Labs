package by.epamtc.jwd.service;

import by.epamtc.jwd.entity.plane.AbstractPlane;

import java.util.Comparator;
import java.util.List;

public interface SortPlaneService {
    void sortPlanes(List<AbstractPlane> planes, Comparator comparator);
}
