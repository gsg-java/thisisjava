package gs3.kingbbode.step4;

import gs3.kingbbode.step3.abstracts.AbstractMobile;
import gs3.kingbbode.step4.abstracts.AbstractCameraPhone;

/**
 * Created by YG on 2017-07-07.
 */
public class Chocolate extends AbstractCameraPhone{
    public Chocolate() {
        super("Chocolate");
    }

    @Override
    public void call() {
        System.out.println("또로롱");
    }
}
