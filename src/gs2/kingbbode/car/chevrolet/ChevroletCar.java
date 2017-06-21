package gs2.kingbbode.car.chevrolet;

import gs2.kingbbode.brand.Chevrolet;
import gs2.kingbbode.car.Car;
import gs2.kingbbode.engine.Engine;

/**
 * Created by YG-MAC on 2017. 6. 21..
 */
public class ChevroletCar extends Car {
    public ChevroletCar(String name, Engine engine) {
        super(name, new Chevrolet(), engine);
    }
}
