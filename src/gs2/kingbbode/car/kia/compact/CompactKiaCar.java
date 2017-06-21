package gs2.kingbbode.car.kia.compact;

import gs2.kingbbode.car.kia.KiaCar;
import gs2.kingbbode.engine.Compact;

/**
 * Created by YG-MAC on 2017. 6. 20..
 */
public class CompactKiaCar extends KiaCar{
    public CompactKiaCar(String name) {
        super(name, new Compact());
    }
}
