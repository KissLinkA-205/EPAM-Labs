package by.epamtc.jwd.util;

import by.epamtc.jwd.entity.plane.AbstractPlane;
import by.epamtc.jwd.util.comparator.*;

import java.util.Comparator;

public class PlaneComparatorBuilder {
    private Comparator<AbstractPlane> comparator;

    public PlaneComparatorBuilder(Comparator<AbstractPlane> comparator) {
        this.comparator = comparator;
    }

    public Comparator<AbstractPlane> build() {
        return comparator;
    }

    public PlaneComparatorBuilder compareByAirplaneModel() {
        comparator = comparator.thenComparing(new AirplaneModelComparator());
        return this;
    }

    public PlaneComparatorBuilder compareByCrewSize() {
        comparator = comparator.thenComparing(new CrewSizeComparator());
        return this;
    }

    public PlaneComparatorBuilder compareByFuelConsumption() {
        comparator = comparator.thenComparing(new FuelConsumptionComparator());
        return this;
    }

    public PlaneComparatorBuilder compareByMaxFlightAltitude() {
        comparator = comparator.thenComparing(new MaxFlightAltitudeComparator());
        return this;
    }

    public PlaneComparatorBuilder compareByMaxSpeed() {
        comparator = comparator.thenComparing(new MaxSpeedComparator());
        return this;
    }
}
