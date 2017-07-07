package gs3.kingbbode.step5;

import gs3.kingbbode.step5.abstracts.SmartPhone;

/**
 * Created by YG on 2017-07-07.
 */
public class IPhone extends SmartPhone {
    public IPhone(String[] playList) {
        super("IPhone", playList);
    }

    @Override
    public void call() {
        System.out.println("또로로롱");
    }

    @Override
    protected void play(String music) {
        System.out.println(music);
        System.out.println("!!!!!!!!!!!!!");
    }
}
