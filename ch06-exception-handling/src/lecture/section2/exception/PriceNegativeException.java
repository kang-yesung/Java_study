package lecture.exception.section2.exception;

public class PriceNegativeException extends Exception {
    public PriceNegativeException() {}

    public PriceNegativeException(String message) {
        super(message);
    }
}
