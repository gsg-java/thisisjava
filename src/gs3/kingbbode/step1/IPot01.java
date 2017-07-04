package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IPot01 implements MP3 {
    @Override
    public void play() {
        System.out.println("암쏘소리벗알러뷰다거짓말, 이야 몰랐어");
    }

    @Override
    public String getName() {
        return "IPot 1세대";
    }
}
