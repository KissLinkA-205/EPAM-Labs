package by.epamtc.jwd.entity;

public enum DeviceOption {
    DEVICES("devices"),
    DEVICE("device"),
    ID("id"),
    DEVICE_GROUP("device-group"),
    NAME("name"),
    ORIGIN("origin"),
    PRICE("price"),
    PERIPHERAL("peripheral"),
    ENERGY_CONSUMPTION("energy-consumption"),
    COOLER("cooler"),
    COM("com"),
    USB("usb"),
    LPT("lpt"),
    CRITICAL("critical"),
    TYPE("type");

    private final String option;

    DeviceOption(String option) {
        this.option = option;
    }

    public String getGroup() {
        return this.option;
    }
}
