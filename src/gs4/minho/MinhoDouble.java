package gs4.minho;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 12..
 */
public class MinhoDouble implements MinhoNumber{
    private double value = 0;

    MinhoDouble(double value) {
        this.value = value;
    }

    @Override
    public MinhoNumber plus(MinhoNumber number) {
        this.value += ((MinhoDouble) number).value;
        return this;
    }

    @Override
    public MinhoNumber minus(MinhoNumber number) {
        this.value -= ((MinhoDouble) number).value;
        return this;
    }

    @Override
    public MinhoNumber multiply(MinhoNumber number) {
        this.value *= ((MinhoDouble) number).value;
        return this;
    }

    @Override
    public MinhoNumber divide(MinhoNumber number) {
        this.value /= ((MinhoDouble) number).value;
        return this;
    }

    @Override
    public int getIntValue() {
        return (int)value;
    }

    @Override
    public double getDoubleValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value == ((MinhoNumber)obj).getDoubleValue();
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
