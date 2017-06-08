package gs1.minho.request;

import gs1.minho.model.Emplyee;

import java.util.Map;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class ShowAllRequest implements Request {
    @Override
    public String getRequestName() {
        return "ShowAll";
    }
}
