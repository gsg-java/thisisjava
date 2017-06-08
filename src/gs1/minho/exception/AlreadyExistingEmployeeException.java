package gs1.minho.exception;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class AlreadyExistingEmployeeException extends RuntimeException {
    public AlreadyExistingEmployeeException(String message) {
        super(message);
    }
}
