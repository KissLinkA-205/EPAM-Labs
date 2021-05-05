package by.epamtc.jwd.entity.plane;

public abstract class AbstractPlane {
    private static int globalID = 0;

    private String airplaneModel;
    private final int id;
    private double maxSpeed;
    private double maxFlightAltitude;
    private double fuelConsumption;
    private int crewSize;

    {
        globalID++;
        this.id = globalID;
    }

    public abstract double getSpecialParameter();

    AbstractPlane() {
    }

    public AbstractPlane(String airplaneModel, double maxSpeed, double maxFlightAltitude,
                         double fuelConsumption, int crewSize) {
        this.airplaneModel = airplaneModel;
        this.maxSpeed = maxSpeed;
        this.maxFlightAltitude = maxFlightAltitude;
        this.fuelConsumption = fuelConsumption;
        this.crewSize = crewSize;
    }

    public int getId() {
        return this.id;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public String getAirplaneModel() {
        return this.airplaneModel;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxFlightAltitude(double maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public double getMaxFlightAltitude() {
        return this.maxFlightAltitude;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public int getCrewSize() {
        return this.crewSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        AbstractPlane that = (AbstractPlane) o;
        if (!this.airplaneModel.equals(that.airplaneModel)) return false;
        if (Double.compare(this.maxSpeed, that.maxSpeed) != 0) return false;
        if (Double.compare(this.maxFlightAltitude, that.maxFlightAltitude) != 0) return false;
        if (Double.compare(this.fuelConsumption, that.fuelConsumption) != 0) return false;
        return this.crewSize == that.crewSize;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airplaneModel == null) ? 0 : airplaneModel.hashCode());
        result = prime * result + (int) Double.doubleToLongBits(maxSpeed);
        result = prime * result + (int) Double.doubleToLongBits(maxFlightAltitude);
        result = prime * result + (int) Double.doubleToLongBits(fuelConsumption);
        result = prime * result + crewSize;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "airplaneModel = " + airplaneModel + ", id = " + id + ", maxSpeed = " + maxSpeed +
                ", maxFlightAltitude = " + maxFlightAltitude + ", fuelConsumption = " + fuelConsumption +
                ", crewSize = " + crewSize + "}";
    }
}