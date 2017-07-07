package gs3.kingbbode.step5.abstracts;

import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step4.abstracts.AbstractCameraPhone;

/**
 * Created by YG on 2017-07-07.
 */
public abstract class SmartPhone extends AbstractCameraPhone implements MP3{
    public SmartPhone(String name, String[] playList) {
        super(name);
        this.playList = playList;
    }
    private String[] playList;
    private int nowRecord = 0;
    
    @Override
    public void play() {
        play(playList[nowRecord]);
    }
    
    protected abstract void play(String music);
    
    @Override
    public void next() {
        nowRecord++;
        play();
    }

    @Override
    public void sendMessage() {
        System.out.println("메시지 전송 중");
        System.out.println("메시지 전송 완료");
    }
}
