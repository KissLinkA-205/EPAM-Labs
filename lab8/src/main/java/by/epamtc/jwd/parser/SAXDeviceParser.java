package by.epamtc.jwd.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.io.InputStream;

public class SAXDeviceParser extends AbstractDeviceParser {
    private static final Logger LOGGER = LogManager.getLogger(SAXDeviceParser.class);
    private DeviceHandler deviceHandler;
    private XMLReader reader;

    public SAXDeviceParser() {
        super();
        deviceHandler = new DeviceHandler();
        try {
            reader = XMLReaderFactory.createXMLReader ();
            reader.setContentHandler(deviceHandler);
        } catch (SAXException e) {
            LOGGER.error("Error in SAX Constructor", e);
        }
    }

    @Override
    public void buildSetDevices(InputStream fileName) {
        try {
            reader.parse(new InputSource(fileName));
            devices = deviceHandler.getDevices();
        } catch (SAXException | IOException e) {
            LOGGER.error("SAX parsing error! ", e);
        }
    }
}
