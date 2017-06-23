package gs2.minho.Brand;

import gs2.minho.Fuel.Diesel;
import gs2.minho.Fuel.Fuel;
import gs2.minho.Fuel.Gasoline;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 24..
 */
public class Chevrolet extends Brand {
    private final int dieselDiscount = 110;
    private final int gasolineDiscount = 0;

    @Override
    public int influenceFuelEfficiency(int value) {
        return value + 4;
    }

    @Override
    public int influenceSpeed(int speed) {
        return speed;
    }

    @Override
    public int discountCost(int amount, Fuel fuel) {
        int discountCost = 0;
        if (fuel instanceof Diesel) discountCost = amount * dieselDiscount;
        else if (fuel instanceof Gasoline) discountCost = amount * gasolineDiscount;
        return discountCost;
    }

    @Override
    public String toString() {
        return "브랜드 : 쉐보레 ";
    }
}
