package by.epamtc.jwd.exceptions;

public class EmptyPlaneException extends Exception {
    public EmptyPlaneException(String message) {
        super(message);
    }

    public EmptyPlaneException() {
        super();
    }

    public EmptyPlaneException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyPlaneException(Throwable cause) {
        super(cause);
    }
}
