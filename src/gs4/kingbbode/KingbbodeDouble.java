package gs4.kingbbode;

import gs3.kingbbode.human.Kingbbode;

/**
 * Created by YG on 2017-07-14.
 */
public class KingbbodeDouble implements KingbbodeNumber{

    public KingbbodeDouble() {
    }

    public KingbbodeDouble(double number) {
        this.number = number;
    }

    private double number;

    @Override
    public int intValue() {
        return (int)number;
    }

    @Override
    public double doubleValue() {
        return number;
    }

    @Override
    public KingbbodeNumber plus(KingbbodeNumber kingbbodeNumber) {
        this.number += kingbbodeNumber.doubleValue();
        return this;
    }

    @Override
    public KingbbodeNumber minus(KingbbodeNumber kingbbodeNumber) {
        this.number -= kingbbodeNumber.doubleValue();
        return this;
    }

    @Override
    public KingbbodeNumber multiply(KingbbodeNumber kingbbodeNumber) {
        this.number *= kingbbodeNumber.doubleValue();
        return this;
    }

    @Override
    public KingbbodeNumber divided(KingbbodeNumber kingbbodeNumber) {
        this.number /= kingbbodeNumber.doubleValue();
        return this;
    }
}
