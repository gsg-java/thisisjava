package gs4.minho;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 12..
 */
public class MinhoInteger implements MinhoNumber{
    private int value = 0;
    MinhoInteger(int value) {
        this.value = value;
    }
    @Override
    public MinhoNumber plus(MinhoNumber number) {
        return new MinhoInteger(value + ((MinhoInteger)number).value);
    }

    @Override
    public MinhoNumber minus(MinhoNumber number) {
        return new MinhoInteger(value - ((MinhoInteger)number).value);
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
