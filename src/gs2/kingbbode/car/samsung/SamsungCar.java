package gs2.kingbbode.car.samsung;

import gs2.kingbbode.brand.Samsung;
import gs2.kingbbode.car.Car;
import gs2.kingbbode.engine.Engine;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class SamsungCar extends Car {
    public SamsungCar(String name, Engine engine) {
        super(name, new Samsung(), engine);
    }
}
