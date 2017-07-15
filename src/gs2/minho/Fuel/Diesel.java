package gs2.minho.fuel;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class Diesel extends Fuel {
    private static final int dieselPrice = 1000;
    public Diesel() {
        super(dieselPrice);
    }
    @Override
    public String toString() {
        return "주유 종류 : 경유 ";
    }
}
