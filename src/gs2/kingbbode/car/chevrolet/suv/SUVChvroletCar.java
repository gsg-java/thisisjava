package gs2.kingbbode.car.chevrolet.suv;

import gs2.kingbbode.car.chevrolet.ChevroletCar;
import gs2.kingbbode.engine.SUV;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SUVChvroletCar extends ChevroletCar {
    public SUVChvroletCar(String name) {
        super(name, new SUV());
    }
}
