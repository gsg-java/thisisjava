package gs2.kingbbode.car.kia;

import gs2.kingbbode.brand.Kia;
import gs2.kingbbode.car.Car;
import gs2.kingbbode.engine.Engine;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class KiaCar extends Car {
    public KiaCar(String name, Engine engine) {
        super(name, new Kia(), engine);
    }
}
