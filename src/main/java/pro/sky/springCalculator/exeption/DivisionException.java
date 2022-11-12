package pro.sky.springCalculator.exeption;

public class DivisionException extends IllegalArgumentException {
    public DivisionException() {
    }

    public DivisionException(String s) {
        super(s);
    }

    public DivisionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionException(Throwable cause) {
        super(cause);
    }
}
