package gs2.kingbbode.car.hyundai.suv;

import gs2.kingbbode.car.hyundai.HyundaiCar;
import gs2.kingbbode.engine.SUV;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SUVHyundaiCar extends HyundaiCar {
    public SUVHyundaiCar(String name) {
        super(name, new SUV());
    }
}
