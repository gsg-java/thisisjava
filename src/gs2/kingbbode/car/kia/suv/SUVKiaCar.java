package gs2.kingbbode.car.kia.suv;

import gs2.kingbbode.car.kia.KiaCar;
import gs2.kingbbode.engine.SUV;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SUVKiaCar extends KiaCar {
    public SUVKiaCar(String name) {
        super(name, new SUV());
    }
}
