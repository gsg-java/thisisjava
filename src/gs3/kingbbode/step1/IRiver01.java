package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IRiver01 implements MP3 {
    private int nowRecord = 0;
    private String[] playList;
    
    public IRiver01(String[] playList) {
        this.playList = playList;
    }


    @Override
    public void play() {
        System.out.println("~~");
        System.out.println(playList[nowRecord]);
        System.out.println("!!");
    }

    @Override
    public void next() {
        nowRecord++;
        play();
    }

    @Override
    public String getName() {
        return "IRiver-001";
    }
}
