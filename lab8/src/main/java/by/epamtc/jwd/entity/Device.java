package by.epamtc.jwd.entity;

import java.util.Objects;

public class Device {
    private String id;
    private DeviceGroup deviceGroup;
    private String name;
    private String origin;
    private double price;
    private DeviceType deviceType;
    private boolean critical;

    public Device() {
        deviceType = new DeviceType();
    }

    public Device(String id, String name, String origin, double price, DeviceType deviceType, boolean critical) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.deviceType = deviceType;
        this.critical = critical;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeviceGroup(DeviceGroup deviceGroup) {
        this.deviceGroup = deviceGroup;
    }

    public DeviceGroup getDeviceGroup() {
        return deviceGroup;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    public boolean isCritical() {
        return critical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Device that = (Device) o;
        if (!this.id.equals(that.id)) return false;
        if (!this.deviceGroup.getGroup().equals(that.deviceGroup.getGroup())) return false;
        if (!this.name.equals(that.name)) return false;
        if (!this.origin.equals(that.origin)) return false;
        if (this.price != that.price) return false;
        if (!this.deviceType.equals(that.deviceType)) return false;
        return this.critical == that.critical;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : Objects.hash(id));
        result = prime * result + Objects.hash(deviceGroup);
        result = prime * result + ((name == null) ? 0 : Objects.hash(name));
        result = prime * result + ((origin == null) ? 0 : Objects.hash(origin));
        result = prime * result + (int) Double.doubleToLongBits(price);
        result = prime * result + deviceType.hashCode();
        result = prime * result + Objects.hash(critical);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                ", id = " + id + ", deviceGroup = " + deviceGroup +
                "name = " + name + ", origin = " + origin + ", price = " + price +
                ", deviceType = " + deviceType + ", critical = " + critical + "}";
    }
}