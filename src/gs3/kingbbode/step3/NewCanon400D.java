package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractCamera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewCanon400D extends AbstractCamera{
    public NewCanon400D() {
        super("Canon 400D");
    }

    @Override
    public void snapshot() {
        System.out.println("찰카");
        System.out.println("아악");
    }

    @Override
    protected void settingSutterSpeed() {
        System.out.println("셔터 속도 조절...");
        System.out.println("..");
    }

    @Override
    protected void focus() {
        System.out.println("초점 조절...");
        System.out.println("..");
        System.out.println("...");
    }
}
