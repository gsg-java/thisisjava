package gs2.minho.Engine;

import gs2.minho.Fuel.Fuel;
import gs2.minho.Fuel.Gasoline;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class SportsCarEngine extends Engine{
    public SportsCarEngine() {
        this.fuelType = new Gasoline();
    }

    @Override
    public int influenceFuelEfficiency(int value) {
        return value - 5;
    }

    @Override
    public int influenceSpeed(int speed) {
        return speed + 10;
    }

    @Override
    public int costOfChargingFuel(int amount) {
        return amount * this.fuelType.getPricePerLiter();
    }

    @Override
    public String toString() {
        return "종류 : 스포츠카 ";
    }

    @Override
    public Fuel fuelType() {
        return this.fuelType;
    }
}
