package gs2.kingbbode.car.chevrolet.compact;

import gs2.kingbbode.car.chevrolet.ChevroletCar;
import gs2.kingbbode.engine.Compact;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class CompactChvroletCar extends ChevroletCar {
    public CompactChvroletCar(String name) {
        super(name, new Compact());
    }
}
