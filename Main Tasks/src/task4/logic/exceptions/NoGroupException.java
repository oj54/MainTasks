package task4.logic.exceptions;

public class NoGroupException extends Exception {
    public NoGroupException() {
        super();
    }

    public NoGroupException(String message) {
        super(message);
    }

    public NoGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoGroupException(Throwable cause) {
        super(cause);
    }
}
