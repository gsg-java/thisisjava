package gs6.example.domain;

/**
 * Created by YG-MAC on 2017. 8. 12..
 */
public class DiscountItem {
    private String name;
    private int rate;

    public DiscountItem(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public int discount(int price) {
        return price * (100 - rate) / 100;
    }
}
