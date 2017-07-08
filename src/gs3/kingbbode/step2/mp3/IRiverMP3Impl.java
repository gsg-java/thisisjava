package gs3.kingbbode.step2.mp3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IRiverMP3Impl  extends MP3Impl {

    public IRiverMP3Impl(String[] playList) {
        super("IRiver", playList);
    }

    @Override
    public void play() {
        System.out.println("~~");
        System.out.println(playList[nowRecord]);
        System.out.println("!!");
    }
}
