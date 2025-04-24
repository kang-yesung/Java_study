package lecture.exception.section2.exception;

public class MoneyNegativeException extends RuntimeException {
  public MoneyNegativeException() {
  }

  public MoneyNegativeException(String message) {
        super(message);
    }
}
