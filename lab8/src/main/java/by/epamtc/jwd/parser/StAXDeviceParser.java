package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;
import by.epamtc.jwd.entity.DeviceGroup;
import by.epamtc.jwd.entity.DeviceOption;
import by.epamtc.jwd.entity.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class StAXDeviceParser extends AbstractDeviceParser {

    private static final Logger LOGGER = LogManager.getLogger(SAXDeviceParser.class);
    private XMLInputFactory inputFactory;

    public StAXDeviceParser() {
        super();
        inputFactory = XMLInputFactory.newInstance();
    }

    @Override
    public void buildSetDevices(InputStream stream) {
        String name;

        try {
            XMLStreamReader reader = inputFactory.createXMLStreamReader(stream);

            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    name = reader.getLocalName();
                    if (name.equals(DeviceOption.DEVICE.getOption())) {
                        Device device = buildDevices(reader, new Device());
                        devices.add(device);
                    }
                }
            }
        } catch (XMLStreamException e) {
            LOGGER.error("StAX parsing error! ", e);
        }
    }

    private Device buildDevices(XMLStreamReader reader, Device device) throws XMLStreamException {
        device.setId(reader.getAttributeValue(null, DeviceOption.ID.getOption()));
        device.setDeviceGroup(DeviceGroup.fromValue(reader.getAttributeValue(null, DeviceOption.DEVICE_GROUP.getOption())));

        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (DeviceOption.valueOf(name.replace("-", "_").toUpperCase())) {
                        case NAME:
                            device.setName(getXMLText(reader));
                            break;
                        case ORIGIN:
                            device.setOrigin(getXMLText(reader));
                            break;
                        case PRICE:
                            device.setPrice(Double.parseDouble(getXMLText(reader)));
                            break;
                        case TYPE:
                            device.setDeviceType(getXMLType(reader));
                            break;
                        case CRITICAL:
                            device.setCritical(Boolean.parseBoolean(getXMLText(reader)));
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName().replace("-", "_").toUpperCase();
                    DeviceOption deviceOption = DeviceOption.valueOf(name);
                    if (deviceOption == DeviceOption.DEVICE) {
                        return device;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element");
    }

    private DeviceType getXMLType(XMLStreamReader reader) throws XMLStreamException {
        DeviceType deviceType = new DeviceType();

        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (DeviceOption.valueOf(name.replace("-", "_").toUpperCase())) {
                        case PERIPHERAL:
                            deviceType.setPeripheral(Boolean.parseBoolean(getXMLText(reader)));
                            break;
                        case ENERGY_CONSUMPTION:
                            deviceType.setEnergyConsumption(Integer.parseInt(getXMLText(reader)));
                            break;
                        case COOLER:
                            deviceType.setCooler(Boolean.parseBoolean(getXMLText(reader)));
                            break;
                        case USB:
                            deviceType.setUSB(Integer.parseInt(getXMLText(reader)));
                            break;
                        case COM:
                            deviceType.setCOM(Integer.parseInt(getXMLText(reader)));
                            break;
                        case LPT:
                            deviceType.setLPT(Integer.parseInt(getXMLText(reader)));
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName().replace("-", "_").toUpperCase();
                    DeviceOption deviceOption = DeviceOption.valueOf(name);
                    if (deviceOption == DeviceOption.TYPE) {
                        return deviceType;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element");
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }
}