package gs2.kingbbode.oil;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class Diesel implements Oil {
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getName() {
        return "경유";
    }
}
