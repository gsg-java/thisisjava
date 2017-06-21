package gs2.kingbbode.car.hyundai.compact;

import gs2.kingbbode.car.hyundai.HyundaiCar;
import gs2.kingbbode.engine.Compact;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class CompactHyundaiCar extends HyundaiCar {
    public CompactHyundaiCar(String name) {
        super(name, new Compact());
    }
}
