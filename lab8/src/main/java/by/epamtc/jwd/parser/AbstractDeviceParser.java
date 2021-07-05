package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractDeviceParser {
    protected Set<Device> devices;

    public AbstractDeviceParser() {
        this.devices = new HashSet<>();
    }

    public Set<Device> getDevices() {
        return devices;
    }

    abstract public void buildSetDevices(InputStream stream);
}
