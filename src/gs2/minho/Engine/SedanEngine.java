package gs2.minho.engine;

import gs2.minho.fuel.Fuel;
import gs2.minho.fuel.Gasoline;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class SedanEngine extends Engine {
    public SedanEngine() {
        this.fuelType = new Gasoline();
    }

    @Override
    public String toString() {
        return "종류 : 승용차 ";
    }

    @Override
    public int influenceFuelEfficiency(int value) {
        return value + 3;
    }

    @Override
    public int influenceSpeed(int speed) {
        return speed - 4;
    }

    @Override
    public int costOfChargingFuel(int amount) {
        return amount * this.fuelType.getPricePerLiter();
    }

    @Override
    public Fuel fuelType() {
        return this.fuelType;
    }
}
