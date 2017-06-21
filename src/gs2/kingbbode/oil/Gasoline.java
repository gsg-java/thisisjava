package gs2.kingbbode.oil;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class Gasoline implements Oil{
    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String getName() {
        return "휘발유";
    }
}
