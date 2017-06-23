package gs2.minho.Engine;

import gs2.minho.Fuel.Fuel;
import gs2.minho.Fuel.Gasoline;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class SUVEngine extends Engine {
    public SUVEngine() {
        this.fuelType = new Gasoline();
    }

    @Override
    public int influenceFuelEfficiency(int value) {
        return value - 3;
    }

    @Override
    public int influenceSpeed(int speed) {
        return speed + 5;
    }

    @Override
    public int costOfChargingFuel(int amount) {
        return amount * this.fuelType.getPricePerLiter();
    }

    @Override
    public String toString() {
        return "종류 : SUV ";
    }

    @Override
    public Fuel fuelType() {
        return fuelType;
    }
}
