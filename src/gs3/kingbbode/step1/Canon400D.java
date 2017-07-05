package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class Canon400D implements Camera{
    @Override
    public void snapshot() {
        System.out.println("찰카");
        System.out.println("아악");
    }

    @Override
    public String getName() {
        return "Canon  400D";
    }
}
