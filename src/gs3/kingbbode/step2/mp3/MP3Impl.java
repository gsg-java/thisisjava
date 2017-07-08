package gs3.kingbbode.step2.mp3;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class MP3Impl implements MP3 {
    protected String name;
    protected int nowRecord = 0;
    protected String[] playList;

    public MP3Impl(String name, String[] playList) {
        this.name = name;
        this.playList = playList;
    }

    @Override
    public void play() {
        /**
         * 구현하세요
         */
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
