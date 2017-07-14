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
        this.value += ((MinhoInteger)number).value;
        return this;
    }

    @Override
    public MinhoNumber minus(MinhoNumber number) {
        this.value -= ((MinhoInteger)number).value;
        return this;
    }

    @Override
    public MinhoNumber multiply(MinhoNumber number) {
        this.value *= ((MinhoInteger)number).value;
        return this;
    }

    @Override
    public MinhoNumber divide(MinhoNumber number) {
        this.value /= ((MinhoInteger)number).value;
        return this;
    }

    @Override
    public int getIntValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value == ((MinhoNumber)obj).getDoubleValue();
    }

    @Override
    public double getDoubleValue() {
        return (double)value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
