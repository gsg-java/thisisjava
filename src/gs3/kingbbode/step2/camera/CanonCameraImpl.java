package gs3.kingbbode.step2.camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class CanonCameraImpl extends CameraImpl {
    public CanonCameraImpl() {
        super("Canon 400D");
    }

    @Override
    public void snapshot() {
        System.out.println("예열..");
        System.out.println("셔터 속도 조절...");
        System.out.println("..");
        System.out.println("초점 조절...");
        System.out.println("..");
        System.out.println("...");
        System.out.println("찰칵");
    }
}
