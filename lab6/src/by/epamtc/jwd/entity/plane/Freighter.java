package by.epamtc.jwd.entity.plane;

public class Freighter extends AbstractPlane {
    private double carryingCapacity;

    Freighter() {
    }

    public Freighter(String airplaneModel, double maxSpeed, double maxFlightAltitude,
                     double fuelConsumption, int crewSize, double carryingCapacity) {
        super(airplaneModel, maxSpeed, maxFlightAltitude, fuelConsumption, crewSize);
        this.carryingCapacity = carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return this.carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Freighter that = (Freighter) o;
        if (!super.equals(that)) return false;
        return Double.compare(this.carryingCapacity, that.carryingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) Double.doubleToLongBits(carryingCapacity);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "airplaneModel = " + super.getAirplaneModel() +
                ", id = " + super.getId() + ", " +
                "maxSpeed = " + super.getMaxSpeed() +
                ", maxFlightAltitude = " + super.getMaxFlightAltitude() +
                ", fuelConsumption = " + super.getFuelConsumption() +
                ", crewSize = " + super.getCrewSize() +
                ", carryingCapacity = " + carryingCapacity + "}";
    }
}