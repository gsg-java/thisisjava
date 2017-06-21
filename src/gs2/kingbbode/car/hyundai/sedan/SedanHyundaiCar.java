package gs2.kingbbode.car.hyundai.sedan;

import gs2.kingbbode.car.hyundai.HyundaiCar;
import gs2.kingbbode.engine.Sedan;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SedanHyundaiCar extends HyundaiCar {
    public SedanHyundaiCar(String name) {
        super(name, new Sedan());
    }
}
