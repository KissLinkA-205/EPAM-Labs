package by.epamtc.jwd.exeptions;

public class EmptyArrayException extends Exception {
    public EmptyArrayException(String message) {
        super(message);
    }

    public EmptyArrayException() {
        super();
    }

    public EmptyArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyArrayException(Throwable cause) {
        super(cause);
    }
}
