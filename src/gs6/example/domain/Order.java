package gs6.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YG-MAC on 2017. 8. 12..
 */
public class Order {
    private static final DiscountItem DEFAULT_DISCOUNT_ITEM = new DiscountItem("없음", 0);

    private List<Item> itemList;
    private DiscountItem discountItem;

    public Order() {
        this.itemList = new ArrayList<>();
        this.discountItem = DEFAULT_DISCOUNT_ITEM;
    }

    public void add(Item item) {
        itemList.add(item);
    }

    public void add(DiscountItem discountItem) {
        this.discountItem = discountItem;
    }

    public int calcPrice() {
        int price = 0;
        for(Item item : this.itemList) {
            price += item.getPrice();
        }
        return this.discountItem.discount(price);
    }
}
