package gs1.kingbbode.common.exceptions;

/**
 * Created by YG-MAC on 2017. 6. 9..
 */
public class NotFoundCommandException extends CommandException {
    public NotFoundCommandException() {
        super("존재하지 않는 번호입니다.");
    }
}
