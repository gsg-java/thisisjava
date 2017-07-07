package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractMobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewCyon extends AbstractMobile {
    public NewCyon() {
        super("Cyon");
    }

    @Override
    public void call() {
        System.out.println("따라..");
        System.out.println("라..");
        System.out.println("라..");
    }
}
