package gs3.kingbbode.step6;

import gs3.kingbbode.step6.abstracts.NewSmartPhone;

/**
 * Created by YG on 2017-07-07.
 */
public class NewGalaxy extends NewSmartPhone {

    public NewGalaxy(String[] playList) {
        super("NewIPhone", playList);
    }

    @Override
    public void call() {
        System.out.println("뚜루루룽");
    }

    @Override
    protected void playMusic(String music) {
        System.out.println(music);
        System.out.println("~~~~~~~~~~");
    }
}
