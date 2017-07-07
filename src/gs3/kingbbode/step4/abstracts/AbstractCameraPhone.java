package gs3.kingbbode.step4.abstracts;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step3.abstracts.AbstractMobile;

/**
 * Created by YG on 2017-07-07.
 */
public abstract class AbstractCameraPhone extends AbstractMobile implements Camera{
    public AbstractCameraPhone(String name) {
        super(name);
    }

    @Override
    public void snapshot() {
        System.out.println("찰칵");
    }
}
