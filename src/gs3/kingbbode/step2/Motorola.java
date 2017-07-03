package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class Motorola implements Mobile {
    private String version;

    public Motorola(String version) {
        this.version = version;
    }

    @Override
    public void call() {
        System.out.println("Motorola" + this.version + " Call");
    }
}
