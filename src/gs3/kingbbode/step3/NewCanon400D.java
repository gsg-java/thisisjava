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
}
