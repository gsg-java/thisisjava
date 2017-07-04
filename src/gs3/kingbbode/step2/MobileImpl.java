package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class MobileImpl implements Mobile {
    private String name;

    public MobileImpl(String name) {
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
