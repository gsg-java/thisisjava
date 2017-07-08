package gs3.kingbbode.step2.camera;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class CameraImpl implements Camera {
    private String name;

    public CameraImpl(String name) {
        this.name = name;
    }

    @Override
    public void snapshot() {
        /**
         * 구현하세용
         */
    }

    @Override
    public String getName() {
        return name;
    }
}
