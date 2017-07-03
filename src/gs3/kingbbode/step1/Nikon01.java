package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class Nikon01 implements Camera{
    @Override
    public void snapshot() {
        System.out.println("Nikon01 snapshot");
    }
}
