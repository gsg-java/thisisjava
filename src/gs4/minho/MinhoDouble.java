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
        return new MinhoDouble(value + ((MinhoDouble) number).value);
    }

    @Override
    public MinhoNumber minus(MinhoNumber number) {
        return new MinhoDouble(value - ((MinhoDouble) number).value);
    }
}
