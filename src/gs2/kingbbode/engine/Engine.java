package gs2.kingbbode.engine;

import gs2.kingbbode.oil.Oil;

/**
 * Created by YG-MAC on 2017. 6. 21..
 */
public interface Engine {
    String getModel();
    Oil getOilType();
    int makeSpeed(int originalSpeed);
    int makeFuel(int originalFuelEfficiency);
}
