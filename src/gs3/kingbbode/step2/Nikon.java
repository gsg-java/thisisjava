package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class Nikon implements Camera {
    private String version;

    public Nikon(String version) {
        this.version = version;
    }

    @Override
    public void snapshot() {
        System.out.println("Nikon" + this.version + " Call");
    }
}
