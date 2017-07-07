package gs3.kingbbode.step3.abstracts;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public abstract class AbstractMP3 implements MP3 {
    private String name;
    private int nowRecord = 0;
    private String[] playList;

    public AbstractMP3(String name, String[] playList) {
        this.name = name;
        this.playList = playList;
    }

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
    public String getName() {
        return name;
    }
}
