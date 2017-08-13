package gs6.nekisse.exercise;

/**
 * Created by Nekisse_lee on 2017. 8. 12..
 */
public class MenuItem {
    private  String name;
    private int price;
    private Categorys categorys;

    public MenuItem(String name, int price, Categorys categorys) {
        this.name = name;
        this.price = price;
        this.categorys = categorys;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
           return "메뉴: " + this.name + "  가격: " + this.price + "  종류: "  + this.categorys;

    }
}
