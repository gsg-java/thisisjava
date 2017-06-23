package gs2.minho.Brand;

import gs2.minho.Engine.Fuel;
import gs2.minho.Influenceable;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 19..
 */
public abstract class Brand implements Influenceable{
    private String name;
    public abstract int discountCost(int amount, Fuel fuel);

    @Override
    public String toString() {
        return "Brand :" + name + " ";
    }
}
