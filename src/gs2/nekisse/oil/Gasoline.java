package gs2.nekisse.oil;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class Gasoline implements Oil {
    public int price;

    @Override
    public int OilPrice() {
        return 2000;
    }

    @Override
    public String Oilname() {
        return "휘발유";
    }
}
