package task4.logic.exceptions;

public class NoStudentException extends Exception {
    public NoStudentException() {
        super();
    }

    public NoStudentException(String message) {
        super(message);
    }

    public NoStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoStudentException(Throwable cause) {
        super(cause);
    }
}
