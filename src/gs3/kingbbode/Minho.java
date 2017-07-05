package gs3.kingbbode;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;

import java.util.Random;

/**
 * Created by YG on 2017-07-04.
 */
public class Minho {
    public Minho(MP3[] mp3, Camera[] camera, Mobile[] mobile) {
        Random random = new Random();
        this.mp3 = mp3[random.nextInt(mp3.length)];
        this.camera = camera[random.nextInt(camera.length)];
        this.mobile = mobile[random.nextInt(mobile.length)];
    }

    private MP3 mp3;
    private Camera camera;
    private Mobile mobile;
    
    void TellMeAboutYourLife(){
        System.out.println("나는 오민호.");
        System.out.println(
                "잠자기 전 내 마음을 안정시키기 위해 " + mp3.getName() + "로 음악을 듣지."
        );
        mp3.play();
        System.out.println("이 노래 말고..");
        mp3.next();
        System.out.println("zzzZ");
        System.out.println(
                "나는 나의 아름다운 모습을 " + camera.getName() + "로 담아."
        );
        camera.snapshot();
        
        System.out.println(
                "오늘도 소개팅 어플을 통해 그녀들에게 " + mobile.getName() + "으로 문자를 보내."
        );
        mobile.sendMessage();
        System.out.println("전화해야지!");
        mobile.call();

    }
}
