package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IRever01 implements MP3 {
    @Override
    public void play() {
        System.out.println("IRever Play");
    }
}
