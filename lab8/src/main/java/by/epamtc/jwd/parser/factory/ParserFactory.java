package by.epamtc.jwd.parser.factory;

import by.epamtc.jwd.exeptions.ParserException;
import by.epamtc.jwd.parser.AbstractDeviceParser;
import by.epamtc.jwd.parser.DOMDeviceParser;
import by.epamtc.jwd.parser.SAXDeviceParser;
import by.epamtc.jwd.parser.StAXDeviceParser;

public class ParserFactory {
    private static final ParserFactory INSTANCE = new ParserFactory();

    private enum TypeParser {
        SAX, STAX, DOM
    }

    private ParserFactory() {
    }

    public static ParserFactory getInstance() {
        return INSTANCE;
    }

    public AbstractDeviceParser createDeviceParser(String typeParser) throws ParserException {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM:
                return new DOMDeviceParser();
            case STAX:
                return new StAXDeviceParser();
            case SAX:
                return new SAXDeviceParser();
            default:
                throw new EnumConstantNotPresentException(type.getDeclaringClass(), type.name());
        }
    }
}
