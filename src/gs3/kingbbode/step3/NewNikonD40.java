package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractCamera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewNikonD40 extends AbstractCamera {
    public NewNikonD40() {
        super("Nikon D40");
    }

    @Override
    public void snapshot() {
        System.out.println("츠을커");
        System.out.println("어억");
    }
}
