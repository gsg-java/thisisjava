package gs2.kingbbode.car.chevrolet.sport;

import gs2.kingbbode.car.chevrolet.ChevroletCar;
import gs2.kingbbode.engine.Sport;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SportChvroletCar extends ChevroletCar {
    public SportChvroletCar(String name) {
        super(name, new Sport());
    }
}
