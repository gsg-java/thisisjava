package gs3.kingbbode.step2.mp3;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class IPotMP3Impl extends MP3Impl {

    public IPotMP3Impl(String[] playList) {
        super("IPot 1세대", playList);
    }

    @Override
    public void play() {
        System.out.println(playList[nowRecord]);
        System.out.println("~~");
        System.out.println("!!");
    }
}
