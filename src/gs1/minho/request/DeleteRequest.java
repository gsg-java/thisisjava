package gs1.minho.request;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 16..
 */
public class DeleteRequest implements Request {
    private String name;

    public DeleteRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getRequestName() {
        return "Delete";
    }
}
