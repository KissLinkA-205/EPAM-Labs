package by.epamtc.jwd.parser;

import by.epamtc.jwd.entity.Device;
import by.epamtc.jwd.entity.DeviceGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class DeviceParserTestData {
    private static final Logger LOGGER = LogManager.getLogger(DeviceParserTestData.class);

    @DataProvider(name = "buildSetDevicesData")
    public static Object[] buildSetFlowersData() {
        Device deviceOne = new Device();
        deviceOne.setId("id1");
        deviceOne.setDeviceGroup(DeviceGroup.VIDEO_CARD);
        deviceOne.setName("Video-card ASUS GeForce GTX 1060 6GB GDDR5 [ROG STRIX-GTX1060-O6G-GAMING]");
        deviceOne.setOrigin("China");
        deviceOne.setPrice(1150.00);
        deviceOne.getDeviceType().setPeripheral(false);
        deviceOne.getDeviceType().setEnergyConsumption(120);
        deviceOne.getDeviceType().setCooler(true);
        deviceOne.getDeviceType().setCOM(0);
        deviceOne.getDeviceType().setUSB(0);
        deviceOne.getDeviceType().setLPT(0);
        deviceOne.setCritical(true);


        Device deviceTwo = new Device();
        deviceTwo.setId("id2");
        deviceTwo.setDeviceGroup(DeviceGroup.MOTHERBOARD);
        deviceTwo.setName("Motherboard ASRock B560M Pro4");
        deviceTwo.setOrigin("China");
        deviceTwo.setPrice(318.27);
        deviceTwo.getDeviceType().setPeripheral(false);
        deviceTwo.getDeviceType().setEnergyConsumption(125);
        deviceTwo.getDeviceType().setCooler(false);
        deviceTwo.getDeviceType().setCOM(0);
        deviceTwo.getDeviceType().setUSB(4);
        deviceTwo.getDeviceType().setLPT(0);
        deviceTwo.setCritical(true);

        Device deviceThree = new Device();
        deviceThree.setId("id3");
        deviceThree.setDeviceGroup(DeviceGroup.MULTIMEDIA_DEVICE);
        deviceThree.setName("Headphones Apple AirPods Pro MWP22");
        deviceThree.setOrigin("USA");
        deviceThree.setPrice(574.00);
        deviceThree.getDeviceType().setPeripheral(true);
        deviceThree.getDeviceType().setEnergyConsumption(12);
        deviceThree.getDeviceType().setCooler(false);
        deviceThree.getDeviceType().setCOM(0);
        deviceThree.getDeviceType().setUSB(0);
        deviceThree.getDeviceType().setLPT(0);
        deviceThree.setCritical(false);

        Device deviceFour = new Device();
        deviceFour.setId("id4");
        deviceFour.setDeviceGroup(DeviceGroup.MULTIMEDIA_DEVICE);
        deviceFour.setName("Acoustics SVEN MC-30");
        deviceFour.setOrigin("Finland");
        deviceFour.setPrice(503.33);
        deviceFour.getDeviceType().setPeripheral(true);
        deviceFour.getDeviceType().setEnergyConsumption(200);
        deviceFour.getDeviceType().setCooler(false);
        deviceFour.getDeviceType().setCOM(0);
        deviceFour.getDeviceType().setUSB(0);
        deviceFour.getDeviceType().setLPT(0);
        deviceFour.setCritical(false);

        Set<Device> dataOne = new HashSet<>();
        Set<Device> dataTwo = new HashSet<>();

        dataOne.add(deviceOne);
        dataOne.add(deviceTwo);

        dataTwo.add(deviceThree);
        dataTwo.add(deviceFour);

        InputStream streamOne = null;
        InputStream streamTwo = null;
        try {
            Path path = Paths.get("src/test/resources/testDataOne.xml");
            Path path2 = Paths.get("src/test/resources/testDataTwo.xml");
            streamOne = Files.newInputStream(path);
            streamTwo = Files.newInputStream(path2);
        } catch (IOException e) {
            LOGGER.error("Error in DOM parser test", e);
        }

        return new Object[][]{
                {
                        dataOne, streamOne
                },
                {
                        dataTwo, streamTwo
                }
        };
    }
}
