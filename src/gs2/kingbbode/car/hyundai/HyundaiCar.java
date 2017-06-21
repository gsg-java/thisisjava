package gs2.kingbbode.car.hyundai;

import gs2.kingbbode.brand.Hyundai;
import gs2.kingbbode.car.Car;
import gs2.kingbbode.engine.Engine;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class HyundaiCar extends Car {
    public HyundaiCar(String name, Engine engine) {
        super(name, new Hyundai(), engine);
    }
}