package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NikonD40 implements Camera{
    @Override
    public void snapshot() {
        System.out.println("츠을커어억");
    }


    @Override
    public String getName() {
        return "Nikon D40";
    }
}
