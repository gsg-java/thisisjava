package gs4.kingbbode;

import gs3.kingbbode.human.Kingbbode;

/**
 * Created by YG on 2017-07-14.
 */
public interface KingbbodeNumber {
    int intValue();
    double doubleValue();
    KingbbodeNumber plus(KingbbodeNumber kingbbodeNumber);
    KingbbodeNumber minus(KingbbodeNumber kingbbodeNumber);
    KingbbodeNumber multiply(KingbbodeNumber kingbbodeNumber);
    KingbbodeNumber divided(KingbbodeNumber kingbbodeNumber);
}
