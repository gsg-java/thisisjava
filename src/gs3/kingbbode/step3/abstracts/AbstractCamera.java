package gs3.kingbbode.step3.abstracts;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public abstract class AbstractCamera implements Camera {
    private String name;

    public AbstractCamera(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void snapshot() {
        System.out.println("예열..");
        settingSutterSpeed();
        focus();
        System.out.println("찰칵");
    }
    protected abstract void settingSutterSpeed();
    protected abstract void focus();
}
