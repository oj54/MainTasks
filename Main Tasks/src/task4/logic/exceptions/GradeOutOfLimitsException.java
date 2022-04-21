package task4.logic.exceptions;

public class GradeOutOfLimitsException extends Exception {
    public GradeOutOfLimitsException() {
        super();
    }

    public GradeOutOfLimitsException(String message) {
        super(message);
    }

    public GradeOutOfLimitsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeOutOfLimitsException(Throwable cause) {
        super(cause);
    }
}
