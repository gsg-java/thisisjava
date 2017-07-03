package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.MP3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IRiver implements MP3 {
    private String version;

    public IRiver(String version) {
        this.version = version;
    }

    @Override
    public void play() {
        System.out.println("IRiver" + this.version + " Play");
    }
}
