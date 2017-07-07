package gs3.kingbbode.step3;

import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step3.abstracts.AbstractMP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewIRiver01 extends AbstractMP3 {

    public NewIRiver01(String[] playList) {
        super("IRiver-001", playList);
    }
    
    @Override
    public void play(String music) {
        System.out.println("~~");
        System.out.println(music);
        System.out.println("!!");
    }
}
