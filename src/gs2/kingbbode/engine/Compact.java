package gs2.kingbbode.engine;

import gs2.kingbbode.oil.Diesel;
import gs2.kingbbode.oil.Oil;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class Compact implements Engine{
    private Oil oil;

    public Compact() {
        this.oil = new Diesel();
    }

    @Override
    public String getModel() {
        return "경차";
    }

    @Override
    public Oil getOilType() {
        return oil;
    }

    @Override
    public int makeSpeed(int originalSpeed) {
        return originalSpeed - 10;
    }

    @Override
    public int makeFuel(int originalFuelEfficiency) {
        return originalFuelEfficiency + 5;
    }
}
