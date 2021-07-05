package by.epamtc.jwd.entity;

public enum DeviceGroup {
    MULTIMEDIA_DEVICE("multimedia-device"),
    INPUT_OUTPUT_DEVICE("input-output-device"),
    VIDEO_CARD("video-card"),
    CPU("cpu"),
    MOTHERBOARD("motherboard"),
    RAM("ram"),
    COOLING_SYSTEM("cooling-system"),
    SSD("ssd"),
    HDD("hdd"),
    CASE("case"),
    POWER_SUPPLY("power-supply"),
    SOUND_CARD("sound-card"),
    NETWORK_ADAPTER("network-adapter"),
    OPTICAL_DRIVE("optical-drive");

    private final String group;

    DeviceGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return this.group;
    }

    public static DeviceGroup fromValue(String value) {
        for (DeviceGroup currentEnum : DeviceGroup.values()) {
            if (currentEnum.getGroup().equals(value)) {
                return currentEnum;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
