package gs3.kingbbode.step5;

import gs3.kingbbode.step5.abstracts.SmartPhone;

/**
 * Created by YG on 2017-07-07.
 */
public class Galaxy extends SmartPhone {
    public Galaxy(String[] playList) {
        super("Galaxy", playList);
    }

    @Override
    public void call() {
        System.out.println("뚜루루룽");
    }

    @Override
    protected void play(String music) {
        System.out.println(music);
        System.out.println("~~~~~~~~~~");
    }
}
