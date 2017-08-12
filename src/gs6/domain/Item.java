package gs6.domain;

/**
 * Created by YG-MAC on 2017. 8. 12..
 */

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String print() {
        return this.name + " : " + this.price + "\n";
    }
}
