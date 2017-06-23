package gs2.minho.Engine;

import gs2.minho.Fuel.Diesel;
import gs2.minho.Fuel.Fuel;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class CompactCarEngine extends Engine {
    public CompactCarEngine() {
        this.fuelType = new Diesel();
    }

    @Override
    public String toString() {
        return "종류 : 경차 ";
    }

    @Override
    public int influenceFuelEfficiency(int value) {
        return value + 5;
    }

    @Override
    public int influenceSpeed(int speed) {
        return speed - 10;
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
