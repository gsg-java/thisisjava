package gs3.kingbbode.step4.abstracts;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step3.abstracts.AbstractDSLR;
import gs3.kingbbode.step3.abstracts.AbstractMobile;
import gs3.kingbbode.step3.abstracts.CameraImpl;

/**
 * Created by YG on 2017-07-07.
 */
public abstract class AbstracDSLRCameraPhone extends AbstractMobile implements Camera{
    protected Camera camera;
    public AbstracDSLRCameraPhone(String name) {
        super(name);
        this.camera = new AbstractDSLR(name) {
            @Override
            protected void settingSutterSpeed() {
                System.out.println("DSLR PHONE speed");
            }

            @Override
            protected void focus() {
                System.out.println("DSLR PHONE focus");
            }
        };
    }

    @Override
    public void snapshot() {
        this.camera.snapshot();
    }
}
