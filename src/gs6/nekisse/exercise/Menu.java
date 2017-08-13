package gs6.nekisse.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 12..
 */
public class Menu {
    private Map<String,MenuItem> menu;

    public Menu() {
        this.menu = new HashMap<>();
        menu.put("에스프레소",new MenuItem("에스프레소",3000,Categorys.COFFEE));
        menu.put("아메리카노",new MenuItem("아메리카노", 3000,Categorys.COFFEE));
        menu.put("카페라떼",new MenuItem("카페라떼", 4000,Categorys.COFFEE));
        menu.put("카푸치노",new MenuItem("카푸치노", 4000,Categorys.COFFEE));
        menu.put("생과일주스",new MenuItem("생과일주스", 5000,Categorys.BEVERAGE));
        menu.put("스무디",new MenuItem("스무디", 5000,Categorys.BEVERAGE));
        menu.put("베이글",new MenuItem("베이글", 3000,Categorys.SIDEMENU));
        menu.put("조각케익",new MenuItem("조각케익", 4500,Categorys.SIDEMENU));
    }

    public Collection<MenuItem> findAll() {
        return menu.values();
    }

    private void printMenu(){
    }

}
