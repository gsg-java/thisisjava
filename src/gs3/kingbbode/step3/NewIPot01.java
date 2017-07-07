package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractMP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewIPot01 extends AbstractMP3 {
    public NewIPot01(String[] playList) {
        super("IPot 1세대", playList);
    }

    @Override
    public void play(String music) {
        System.out.println(music);
        System.out.println("~~");
        System.out.println("!!");
    }
}
