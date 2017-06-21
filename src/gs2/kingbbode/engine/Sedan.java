package gs2.kingbbode.engine;

import gs2.kingbbode.oil.Gasoline;
import gs2.kingbbode.oil.Oil;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class Sedan implements Engine {
    private Oil oil;

    public Sedan() {
        this.oil = new Gasoline();
    }

    @Override
    public String getModel() {
        return "승용차";
    }

    @Override
    public Oil getOilType() {
        return oil;
    }

    @Override
    public int makeSpeed(int originalSpeed) {
        return originalSpeed - 5;
    }

    @Override
    public int makeFuel(int originalFuelEfficiency) {
        return originalFuelEfficiency + 2;
    }
}
