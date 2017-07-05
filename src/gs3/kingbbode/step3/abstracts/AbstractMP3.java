package gs3.kingbbode.step3.abstracts;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public abstract class AbstractMP3 implements MP3 {
    private String name;
    protected int nowRecord = 0;

    public AbstractMP3(String name) {
        this.name = name;
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
