package gs2.minho.brand;

import gs2.minho.fuel.Fuel;
import gs2.minho.Influenceable;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 19..
 */
public abstract class Brand implements Influenceable{
    public abstract int discountCost(int amount, Fuel fuel);
}
