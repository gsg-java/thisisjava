package gs3.kingbbode.step6.abstracts;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step3.abstracts.AbstractMP3;
import gs3.kingbbode.step3.abstracts.AbstractMobile;
import gs3.kingbbode.step4.abstracts.AbstracDSLRCameraPhone;
import gs3.kingbbode.step4.abstracts.AbstractCameraPhone;

/**
 * Created by YG on 2017-07-07.
 */
public abstract class NewSmartPhone extends AbstracDSLRCameraPhone implements MP3{

    public NewSmartPhone(String name, String[] playList) {
        super(name);
        mp3 = new AbstractMP3(name, playList) {
            @Override
            protected void play(String music) {
                playMusic(music);
            }
        };
    }
    
    private MP3 mp3;

    @Override
    public void sendMessage() {
        System.out.println("메시지 전송 중");
        System.out.println("메시지 전송 완료");
    }
    
    abstract protected void playMusic(String music);

    @Override
    public void play() {
        mp3.play();
    }

    @Override
    public void next() {
        mp3.next();
    }

}
