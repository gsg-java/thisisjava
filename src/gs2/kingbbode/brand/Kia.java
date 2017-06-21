package gs2.kingbbode.brand;

import gs2.kingbbode.brand.Brand;
import gs2.kingbbode.oil.Diesel;
import gs2.kingbbode.oil.Gasoline;
import gs2.kingbbode.oil.Oil;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class Kia implements Brand {
    @Override
    public int discount(Oil oil) {
        if(oil instanceof Diesel){
            return oil.getPrice() - 110;
        }else if(oil instanceof Gasoline) {
            return oil.getPrice() - 100;
        }
        return oil.getPrice();
    }

    @Override
    public String getName() {
        return "기아";
    }

    @Override
    public int renovateSpeed(int originalSpeed) {
        return originalSpeed + 4;
    }

    @Override
    public int renovateFuel(int fuelEfficiency) {
        return fuelEfficiency;
    }
}
