package by.epamtc.jwd.exeptions;

public class NullStringException extends Exception{
    public NullStringException(String message) {
        super(message);
    }

    public NullStringException() {
        super();
    }

    public NullStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStringException(Throwable cause) {
        super(cause);
    }
}
