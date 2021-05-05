package by.epamtc.jwd.entity.plane;

public class PassengerPlane extends AbstractPlane {
    private int passengerSeats;

    PassengerPlane() {
    }

    public PassengerPlane(String airplaneModel, double maxSpeed, double maxFlightAltitude,
                          double fuelConsumption, int crewSize, int passengerSeats) {
        super(airplaneModel, maxSpeed, maxFlightAltitude, fuelConsumption, crewSize);
        this.passengerSeats = passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return this.passengerSeats;
    }

    @Override
    public double getSpecialParameter() {
        return  this.passengerSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        PassengerPlane that = (PassengerPlane) o;
        if (!super.equals(that)) return false;
        return Double.compare(this.passengerSeats, that.passengerSeats) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) Double.doubleToLongBits(passengerSeats);
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
                ", passengerSeats = " + passengerSeats + "}";
    }
}