package gs1.minho.enums;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public enum CompanyPosition {
    CLERK("사원"), SENIOR("주임"), ASSIST("대리"), MANAGER("과장");

    private String position;

    CompanyPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position;
    }
}