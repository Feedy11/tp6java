package tp6;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}