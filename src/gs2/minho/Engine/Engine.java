package gs2.minho.Engine;

import gs2.minho.Fuel.Fuel;
import gs2.minho.Influenceable;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 22..
 */
public abstract class Engine implements Influenceable {
    protected Fuel fuelType;

    @Override
    public abstract int influenceFuelEfficiency(int value);
    @Override
    public abstract int influenceSpeed(int speed);

    public abstract int costOfChargingFuel(int amount);

    public abstract Fuel fuelType();

}
