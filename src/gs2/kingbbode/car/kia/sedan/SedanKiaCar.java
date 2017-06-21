package gs2.kingbbode.car.kia.sedan;

import gs2.kingbbode.car.kia.KiaCar;
import gs2.kingbbode.engine.Sedan;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SedanKiaCar extends KiaCar {
    public SedanKiaCar(String name) {
        super(name, new Sedan());
    }
}
