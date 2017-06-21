package gs2.kingbbode.car.hyundai.sport;

import gs2.kingbbode.car.hyundai.HyundaiCar;
import gs2.kingbbode.engine.Sport;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SportHyundaiCar extends HyundaiCar {
    public SportHyundaiCar(String name) {
        super(name, new Sport());
    }
}
