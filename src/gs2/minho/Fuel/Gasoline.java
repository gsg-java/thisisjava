package gs2.minho.fuel;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 23..
 */
public class Gasoline extends Fuel {
    private static final int gasolinePrice = 2000;

    public Gasoline() {
        super(gasolinePrice);
    }

    @Override
    public String toString() {
        return "주유 종류 : 휘발유 ";
    }
}
