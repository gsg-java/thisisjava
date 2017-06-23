package gs2.minho.Fuel;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 22..
 */
public abstract class Fuel {
    private int pricePerLiter;
    public Fuel(int pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public int getPricePerLiter() {
        return pricePerLiter;
    }
}
