package gs6.nekisse.menu;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class cafeMenu {
    Scanner scanner = new Scanner(System.in);
    private String menuName;
    private  int price;

    public cafeMenu(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public String setMenuName() {
        System.out.print("추가할 메뉴 이름> ");
         this.menuName = scanner.nextLine();
         return menuName;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice() {
        System.out.print("추가한 메뉴의 가격> ");
        this.price= scanner.nextInt();
        return price;
    }
}
