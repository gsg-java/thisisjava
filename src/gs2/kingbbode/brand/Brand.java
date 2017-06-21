package gs2.kingbbode.brand;

import gs2.kingbbode.oil.Oil;

/**
 * Created by YG-MAC on 2017. 6. 21..
 */
public interface Brand {
    int discount(Oil oil);
    String getName();
    int renovateSpeed(int originalSpeed);
    int renovateFuel(int fuelEfficiency);
}
