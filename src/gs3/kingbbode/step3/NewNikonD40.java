package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractDSLR;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewNikonD40 extends AbstractDSLR {
    public NewNikonD40() {
        super("Nikon D40");
    }

    @Override
    protected void settingSutterSpeed() {
        System.out.println("셔터 속도 조절...");
        System.out.println("..");
        System.out.println("...");
    }

    @Override
    protected void focus() {
        System.out.println("초점 조절...");
        System.out.println("..");
    }
}
