package gs4.kingbbode;

/**
 * Created by YG on 2017-07-14.
 */
public class KingbbodeCalculator {
    private KingbbodeNumber result;

    public KingbbodeCalculator(KingbbodeNumber result) {
        this.result = result;
    }

    public KingbbodeCalculator plus(KingbbodeNumber... numbers){
        for(KingbbodeNumber number : numbers){
            result = result.plus(number);
        }
        return this;
    }

    public KingbbodeCalculator minus(KingbbodeNumber... numbers){
        for(KingbbodeNumber number : numbers){
            result = result.minus(number);
        }
        return this;
    }
    
    public KingbbodeCalculator multiply(KingbbodeNumber... numbers){
        for(KingbbodeNumber number : numbers){
            result = result.multiply(number);
        }
        return this;
    }

    public KingbbodeCalculator divided(KingbbodeNumber... numbers){
        for(KingbbodeNumber number : numbers){
            if(number.intValue() == 0){
                throw new RuntimeException("0 안됌");
            }
            result = result.divided(number);
        }
        return this;
    }
    
    public String calculate(){
        if(result instanceof KingbbodeDouble){
            return String.valueOf(result.doubleValue());
        }
        return String.valueOf(result.intValue());
    }
}
