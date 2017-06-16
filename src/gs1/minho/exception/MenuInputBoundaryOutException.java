package gs1.minho.exception;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 12..
 */
public class MenuInputBoundaryOutException extends RuntimeException {
    private String message;
    public MenuInputBoundaryOutException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
