package gs2.kingbbode.car.chevrolet.sedan;

import gs2.kingbbode.car.chevrolet.ChevroletCar;
import gs2.kingbbode.engine.Sedan;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SedanChvroletCar extends ChevroletCar {
    public SedanChvroletCar(String name) {
        super(name, new Sedan());
    }
}
