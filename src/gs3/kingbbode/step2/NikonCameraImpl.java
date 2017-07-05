package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NikonCameraImpl implements Camera {
    private String name;

    public NikonCameraImpl(String name) {
        this.name = name;
    }

    @Override
    public void snapshot() {
        System.out.println("츠을커");
        System.out.println("어억");
    }

    @Override
    public String getName() {
        return name;
    }
}
