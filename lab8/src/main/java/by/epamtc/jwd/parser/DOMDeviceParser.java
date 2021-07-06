package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;
import by.epamtc.jwd.entity.DeviceGroup;
import by.epamtc.jwd.entity.DeviceOption;
import by.epamtc.jwd.entity.DeviceType;
import by.epamtc.jwd.exeptions.ParserException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class DOMDeviceParser extends AbstractDeviceParser {
    private static final Logger LOGGER = LogManager.getLogger(DOMDeviceParser.class);
    private DocumentBuilder documentBuilder;

    public DOMDeviceParser() throws ParserException {
        super();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            documentBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            LOGGER.error("Error in DOM Constructor", e);
            throw new ParserException(e);
        }
    }

    @Override
    public void buildSetDevices(InputStream stream) {
        try {
            Document document = documentBuilder.parse(stream);
            Element element = document.getDocumentElement();

            System.out.println(element.getTagName());

            NodeList devices = element.getElementsByTagName(DeviceOption.DEVICE.getOption());
            fillDevices(devices);
        } catch (SAXException | IOException e) {
            LOGGER.error("DOM parsing error! ", e);
        }
    }

    private void fillDevices(NodeList deviceList) {
        for (int i = 0; i < deviceList.getLength(); i++) {
            Element deviceElement = (Element) deviceList.item(i);
            Device device = buildDevice(deviceElement);
            devices.add(device);
            System.out.println(device);
        }
    }

    private Device buildDevice(Element deviceElement) {
        Device device = new Device();
        if (!deviceElement.getAttribute(DeviceOption.ID.getOption()).isEmpty()) {
            device.setId(deviceElement.getAttribute(DeviceOption.ID.getOption()));
        }
        if (!deviceElement.getAttribute(DeviceOption.DEVICE_GROUP.getOption()).isEmpty()) {
            device.setDeviceGroup(DeviceGroup.fromValue(deviceElement.getAttribute(DeviceOption.DEVICE_GROUP.getOption())));
        }
        device.setName(getElementTextContent(deviceElement, DeviceOption.NAME.getOption()));
        device.setOrigin(getElementTextContent(deviceElement, DeviceOption.ORIGIN.getOption()));
        device.setPrice(Double.parseDouble(getElementTextContent(deviceElement, DeviceOption.PRICE.getOption())));
        device.setCritical(Boolean.parseBoolean(getElementTextContent(deviceElement, DeviceOption.CRITICAL.getOption())));
        device.setDeviceType(fillDeviceType(deviceElement));

        return device;
    }

    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        return node.getTextContent();
    }

    private DeviceType fillDeviceType(Element deviceElement) {
        DeviceType deviceType = new DeviceType();
        Element typeElement = (Element) deviceElement.getElementsByTagName(DeviceOption.TYPE.getOption()).item(0);

        deviceType.setPeripheral(Boolean.parseBoolean(getElementTextContent(typeElement, DeviceOption.PERIPHERAL.getOption())));
        deviceType.setEnergyConsumption(Integer.parseInt(getElementTextContent(deviceElement, DeviceOption.ENERGY_CONSUMPTION.getOption())));
        deviceType.setCooler(Boolean.parseBoolean(getElementTextContent(typeElement, DeviceOption.COOLER.getOption())));
        deviceType.setUSB(Integer.parseInt(getElementTextContent(deviceElement, DeviceOption.USB.getOption())));
        deviceType.setCOM(Integer.parseInt(getElementTextContent(deviceElement, DeviceOption.COM.getOption())));
        deviceType.setLPT(Integer.parseInt(getElementTextContent(deviceElement, DeviceOption.LPT.getOption())));

        return deviceType;
    }
}
