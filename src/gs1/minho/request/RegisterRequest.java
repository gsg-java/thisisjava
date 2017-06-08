package gs1.minho.request;

import gs1.minho.enums.CompanyPosition;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class RegisterRequest implements Request{
    private String name;
    private CompanyPosition position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyPosition getPosition() {
        return position;
    }

    public RegisterRequest(String name, CompanyPosition position) {
        this.name = name;
        this.position = position;
    }
    public void setPosition(CompanyPosition position) {
        this.position = position;
    }

    @Override
    public String getRequestName() {
        return "Register";
    }
}
