package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;
import by.epamtc.jwd.exeptions.ParserException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.Set;

public class SAXDeviceParserTest {
    @Test(dataProvider = "buildSetDevicesData", dataProviderClass = DeviceParserTestData.class)
    public void testBuildSetDevices_InputStream_devices(Set<Device> expected, InputStream stream) throws ParserException {

        AbstractDeviceParser parser = new SAXDeviceParser();
        parser.buildSetDevices(stream);
        Set<Device> actual = parser.devices;

        Assert.assertEquals(actual, expected);
    }
}
