package gs6.nekisse.menu;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class cafeMenu {
    Scanner scanner = new Scanner(System.in);
    private String menuName;
    private  int price;


    public cafeMenu(String mineName, int price) {
        this.menuName = mineName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName() {
        System.out.print("추가할 메뉴 이름> ");
         menuName = scanner.nextLine();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        System.out.print("추가한 메뉴의 가격> ");
        price= scanner.nextInt();
    }
}
