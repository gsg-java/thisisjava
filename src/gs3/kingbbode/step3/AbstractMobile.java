package gs3.kingbbode.step3;

import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class AbstractMobile implements Mobile {
    private String name;

    public AbstractMobile(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("하이");
    }

    @Override
    public String getName() {
        return name;
    }
}
