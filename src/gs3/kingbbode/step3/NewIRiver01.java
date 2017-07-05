package gs3.kingbbode.step3;

import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step3.abstracts.AbstractMP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewIRiver01 extends AbstractMP3 {
    private String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};

    public NewIRiver01() {
        super("IRiver-001");
    }
    @Override
    public void play() {
        System.out.println("~~");
        System.out.println(playList[nowRecord]);
        System.out.println("!!");
    }
}
