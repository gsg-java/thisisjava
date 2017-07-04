package gs3.kingbbode.step3;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class AbstractMP3 implements MP3 {
    private String name;

    public AbstractMP3(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("암쏘소리벗알러뷰다거짓말, 이야 몰랐어");
    }

    @Override
    public String getName() {
        return name;
    }
}
