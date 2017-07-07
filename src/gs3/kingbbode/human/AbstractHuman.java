package gs3.kingbbode.human;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;

import java.util.Random;

/**
 * Created by YG on 2017-07-07.
 */
public abstract class AbstractHuman implements Human{
    public AbstractHuman(MP3[] mp3, Camera[] camera, Mobile[] mobile) {
        Random random = new Random();
        int randomNumber = random.nextInt(mp3.length);
        this.mp3 = mp3[randomNumber];
        this.camera = camera[randomNumber];
        this.mobile = mobile[randomNumber];
    }

    protected MP3 mp3;
    protected Camera camera;
    protected Mobile mobile;
}
