package gs6.nekisse.menu;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class cafeMenu {
    private String menuName;
    private  int price;


    public cafeMenu(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
