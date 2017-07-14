package gs4.kingbbode;

/**
 * Created by YG on 2017-07-14.
 */
public class KingbbodeInteger implements KingbbodeNumber{

    public KingbbodeInteger() {
    }

    public KingbbodeInteger(int number) {
        this.number = number;
    }

    private int number;
    
    @Override
    public int intValue() {
        return number;
    }

    @Override
    public double doubleValue() {
        return (double)number;
    }

    @Override
    public KingbbodeNumber plus(KingbbodeNumber kingbbodeNumber) {
        if(kingbbodeNumber instanceof KingbbodeDouble){
            return kingbbodeNumber.plus(this);
        }
        this.number += kingbbodeNumber.intValue();
        return this;
    }

    @Override
    public KingbbodeNumber minus(KingbbodeNumber kingbbodeNumber) {
        if(kingbbodeNumber instanceof KingbbodeDouble){
            return new KingbbodeDouble(this.number - kingbbodeNumber.doubleValue());
        }
        this.number -= kingbbodeNumber.intValue();
        return this;
    }

    @Override
    public KingbbodeNumber multiply(KingbbodeNumber kingbbodeNumber) {
        if(kingbbodeNumber instanceof KingbbodeDouble){
            return kingbbodeNumber.multiply(this);
        }
        this.number *= kingbbodeNumber.intValue();
        return this;
    }

    @Override
    public KingbbodeNumber divided(KingbbodeNumber kingbbodeNumber) {
        if(kingbbodeNumber instanceof KingbbodeDouble){
            return new KingbbodeDouble(this.number / kingbbodeNumber.doubleValue());
        }
        this.number /= kingbbodeNumber.intValue();
        return this;
    }
}
