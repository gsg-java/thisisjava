package gs6.nekisse.menu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class basicMenu {
    private Map<menuCategory, cafeMenu> basicM;

    public basicMenu(Map<menuCategory, cafeMenu> basicM) {
        this.basicM = new HashMap<>();
        basicM.put(menuCategory.COFFEE, new cafeMenu("에스프레소", 3000));
        basicM.put(menuCategory.COFFEE, new cafeMenu("아메리카노", 3000));
        basicM.put(menuCategory.COFFEE, new cafeMenu("카페라떼", 3000));
        basicM.put(menuCategory.BEVERAGE, new cafeMenu("생과일쥬스", 5000));
        basicM.put(menuCategory.BEVERAGE, new cafeMenu("스무디", 4000));
        basicM.put(menuCategory.SIDEMENU, new cafeMenu("카페라떼", 3000));


    }

}
