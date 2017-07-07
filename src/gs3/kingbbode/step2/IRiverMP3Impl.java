package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IRiverMP3Impl implements MP3 {
    private String name;
    private int nowRecord = 0;
    private String[] playList;

    public IRiverMP3Impl(String name, String[] playList) {
        this.name = name;
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
        return name;
    }
}
