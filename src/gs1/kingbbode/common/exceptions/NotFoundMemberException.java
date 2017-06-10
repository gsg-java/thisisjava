package gs1.kingbbode.common.exceptions;

/**
 * Created by YG-MAC on 2017. 6. 9..
 */
public class NotFoundMemberException extends CommandException{
    public NotFoundMemberException() {
        super("존재하지 않는 사원입니다.");
    }
}
