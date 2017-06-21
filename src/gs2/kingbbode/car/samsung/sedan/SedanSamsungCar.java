package gs2.kingbbode.car.samsung.sedan;

import gs2.kingbbode.car.samsung.SamsungCar;
import gs2.kingbbode.engine.Sedan;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SedanSamsungCar extends SamsungCar {
    public SedanSamsungCar(String name) {
        super(name, new Sedan());
    }
}
