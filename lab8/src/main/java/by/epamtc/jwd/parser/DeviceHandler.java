package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;
import by.epamtc.jwd.entity.DeviceGroup;
import by.epamtc.jwd.entity.DeviceOption;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class DeviceHandler extends DefaultHandler {
    private Set<Device> devices;
    private Device current = null;
    private DeviceOption currentEnum = null;
    private EnumSet<DeviceOption> withText;

    DeviceHandler() {
        devices = new HashSet<>();
        withText = EnumSet.range(DeviceOption.NAME, DeviceOption.CRITICAL);
    }

    public Set<Device> getDevices() {
        return devices;
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if ("device".equals(localName)) {
            current = new Device();
            current.setId(attrs.getValue(0));
            current.setDeviceGroup(DeviceGroup.fromValue(attrs.getValue(1)));
        } else {
            DeviceOption temp = DeviceOption.valueOf(localName.replace("-", "_").toUpperCase());
            if (withText.contains(temp)) {
                currentEnum = temp;
            }
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if ("device".equals(localName)) {
            devices.add(current);
        }
    }

    public void characters(char[] ch, int start, int length) {
        String currentElem = new String(ch, start, length).trim();
        if (currentEnum != null) {
            switch (currentEnum) {
                case NAME:
                    current.setName(currentElem);
                    break;
                case ORIGIN:
                    current.setOrigin(currentElem);
                    break;
                case PRICE:
                    current.setPrice(Double.parseDouble(currentElem));
                    break;
                case PERIPHERAL:
                    current.getDeviceType().setPeripheral(Boolean.parseBoolean(currentElem));
                    break;
                case ENERGY_CONSUMPTION:
                    current.getDeviceType().setEnergyConsumption(Integer.parseInt(currentElem));
                    break;
                case COOLER:
                    current.getDeviceType().setCooler(Boolean.parseBoolean(currentElem));
                    break;
                case COM:
                    current.getDeviceType().setCOM(Integer.parseInt(currentElem));
                    break;
                case USB:
                    current.getDeviceType().setUSB(Integer.parseInt(currentElem));
                    break;
                case LPT:
                    current.getDeviceType().setLPT(Integer.parseInt(currentElem));
                    break;
                case CRITICAL:
                    current.setCritical(Boolean.parseBoolean(currentElem));
                    break;
                default:
                    throw new EnumConstantNotPresentException(
                            currentEnum.getDeclaringClass(), currentEnum.name());
            }
        }
        currentEnum = null;
    }
}
