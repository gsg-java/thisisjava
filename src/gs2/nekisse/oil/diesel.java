package gs2.nekisse.oil;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class diesel implements Oil {
    @Override
    public int OilPrice() {
        return 1000;
    }

    @Override
    public String Oilname() {
        return "경유";
    }
}
