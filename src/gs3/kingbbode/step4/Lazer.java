package gs3.kingbbode.step4;

import gs3.kingbbode.step4.abstracts.AbstractCameraPhone;

/**
 * Created by YG on 2017-07-07.
 */
public class Lazer extends AbstractCameraPhone {
    public Lazer() {
        super("Lazer");
    }
    
    @Override
    public void call() {
        System.out.println("띠리링");
    }
}
