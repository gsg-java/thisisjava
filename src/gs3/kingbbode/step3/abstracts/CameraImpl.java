package gs3.kingbbode.step3.abstracts;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class CameraImpl implements Camera {
    protected String name;

    public CameraImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void snapshot() {
        System.out.println("찰칵");
    }
}
