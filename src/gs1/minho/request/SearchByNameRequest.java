package gs1.minho.request;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class SearchByNameRequest implements Request {
    private String name;

    public SearchByNameRequest(String name) {
        this.name = name;
    }

    @Override
    public String getRequestName() {
        return "SearchByName";
    }

    public String getName() {
        return name;
    }
}
