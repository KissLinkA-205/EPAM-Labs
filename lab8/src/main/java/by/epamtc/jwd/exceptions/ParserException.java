package by.epamtc.jwd.exceptions;

public class ParserException extends Exception {
    public ParserException() {
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

}
