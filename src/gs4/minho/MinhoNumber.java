package gs4.minho;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 12..
 */
public interface MinhoNumber {
    int getIntValue();
    double getDoubleValue();
    MinhoNumber plus(MinhoNumber number);
    MinhoNumber minus(MinhoNumber number);
    MinhoNumber multiply(MinhoNumber number);
    MinhoNumber divide(MinhoNumber number);

}
