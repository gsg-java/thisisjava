package gs1.minho.exception;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class NotExistEmployeeException extends NullPointerException {
    public NotExistEmployeeException(String message) {
        super(message);
    }
}
