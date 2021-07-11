package by.epamtc.jwd.parser.factory;

import by.epamtc.jwd.exeptions.ParserException;
import by.epamtc.jwd.parser.DOMDeviceParser;
import by.epamtc.jwd.parser.SAXDeviceParser;
import by.epamtc.jwd.parser.StAXDeviceParser;
import org.testng.annotations.DataProvider;

public class ParserFactoryTestData {
    @DataProvider(name = "createDeviceParserData")
    public static Object[] createDeviceParserData() throws ParserException {

        String dom = "dom";
        String sax = "sax";
        String stax = "stax";
        ParserFactory factory = ParserFactory.getInstance();

        return new Object[][]{
                {
                        dom, factory, DOMDeviceParser.class
                },
                {
                        sax, factory, SAXDeviceParser.class
                },
                {
                        stax, factory, StAXDeviceParser.class
                },
        };
    }
}
