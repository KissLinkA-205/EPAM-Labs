package by.epamtc.jwd.entity;

import by.epamtc.jwd.entity.plane.AbstractPlane;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    List<AbstractPlane> planes = new ArrayList<>();

    public Airline() {
    }

    public Airline(List<AbstractPlane> planes) {
        if (planes != null) {
            this.planes = new ArrayList<>(planes);
        }
    }

    public List<AbstractPlane> getPlanes() {
        return this.planes;
    }

    public void addPlane(AbstractPlane plane) {
        planes.add(plane);
    }

    public void removePlane(AbstractPlane plane) {
        planes.remove(plane);
    }

    public void removePlane(int planeID) {
        planes.removeIf((plane) -> plane.getId() == planeID);
    }

    public AbstractPlane findPlaneByID(int planeID) {
        for (AbstractPlane plane : planes) {
            if(plane.getId() == planeID) {
                return plane;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Airline that = (Airline) o;
        return this.planes.equals(that.planes);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (AbstractPlane plane : planes) {
            result = result * prime + plane.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getClass().getSimpleName() + " {");
        for (AbstractPlane plane : planes) {
            result.append("\n");
            result.append(plane.toString());
        }
        result.append("\n}");
        return result.toString();
    }
}