package gs2.kingbbode.car.kia.sport;

import gs2.kingbbode.car.kia.KiaCar;
import gs2.kingbbode.engine.Sport;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SportKiaCar extends KiaCar {
    public SportKiaCar(String name) {
        super(name, new Sport());
    }
}
