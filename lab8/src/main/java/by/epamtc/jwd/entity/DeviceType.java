package by.epamtc.jwd.entity;

import java.util.Objects;

public class DeviceType {
    private boolean peripheral;
    private int energyConsumption;
    private boolean cooler;
    private int COM;
    private int USB;
    private int LPT;

    public DeviceType() {
    }

    public DeviceType(boolean peripheral, int energyConsumption, boolean cooler, int COM, int USB, int LPT) {
        this.peripheral = peripheral;
        this.energyConsumption = energyConsumption;
        this.cooler = cooler;
        this.COM = COM;
        this.USB = USB;
        this.LPT = LPT;
    }

    public void setPeripheral(boolean peripheral) {
        this.peripheral = peripheral;
    }

    public boolean isPeripheral() {
        return peripheral;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCOM(int COM) {
        this.COM = COM;
    }

    public int getCOM() {
        return COM;
    }

    public void setUSB(int USB) {
        this.USB = USB;
    }

    public int getUSB() {
        return USB;
    }

    public void setLPT(int LPT) {
        this.LPT = LPT;
    }

    public int getLPT() {
        return LPT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        DeviceType that = (DeviceType) o;
        if (this.peripheral != that.peripheral) return false;
        if (this.energyConsumption != that.energyConsumption) return false;
        if (this.cooler != that.cooler) return false;
        if (this.COM != that.COM) return false;
        if (this.USB != that.USB) return false;
        return this.LPT == that.LPT;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(peripheral);
        result = prime * result + energyConsumption;
        result = prime * result + Objects.hash(cooler);
        result = prime * result + COM;
        result = prime * result + USB;
        result = prime * result + LPT;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "peripheral = " + peripheral + ", energyConsumption = " + energyConsumption +
                ", cooler = " + cooler + ", COM = " + COM +
                ", USB = " + USB + ", LPT = " + LPT + "}";
    }
}
