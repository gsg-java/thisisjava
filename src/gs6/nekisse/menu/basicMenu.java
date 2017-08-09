package gs6.nekisse.menu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class basicMenu {
    private Map<String, cafeMenu> basicM;

    public basicMenu(Map<String, cafeMenu> basicM) {
        this.basicM = new HashMap<>();
        basicM.put("에스프레소", new cafeMenu("에스프레소", 3000));
        basicM.put("아메리카노", new cafeMenu("아메리카노", 3000));
        basicM.put("카페라떼", new cafeMenu("카페라떼", 3000));

    }

}
