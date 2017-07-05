package gs3.kingbbode.step3;

import gs3.kingbbode.step3.abstracts.AbstractMobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NewAnicall extends AbstractMobile{
    public NewAnicall() {
        super("Anicall");
    }

    @Override
    public void call() {
        System.out.println("뚜르..");
        System.out.println("르..");
        System.out.println("르르르");
    }
}
