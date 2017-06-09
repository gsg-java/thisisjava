package gs1.minho.exception;


/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class AlreadyExistEmployeeException extends RuntimeException {
    private String message;
    public AlreadyExistEmployeeException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
