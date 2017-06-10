package gs1.kingbbode.common.exceptions;

/**
 * Created by YG-MAC on 2017. 6. 9..
 */
public class DuplicateNameException extends CommandException{
    public DuplicateNameException() {
        super("중복된 이름이 존재합니다.");
    }
}
