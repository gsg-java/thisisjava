package gs3.kingbbode;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;

import java.util.Random;

/**
 * Created by YG on 2017-07-04.
 */
public class Kingbbode {
    public Kingbbode(MP3[] mp3, Camera[] camera, Mobile[] mobile) {
        Random random = new Random();
        this.mp3 = mp3[random.nextInt(mp3.length)];
        this.camera = camera[random.nextInt(camera.length)];
        this.mobile = mobile[random.nextInt(mobile.length)];
    }

    private MP3 mp3;
    private Camera camera;
    private Mobile mobile;
    
    void TellMeAboutYourLife(){
        System.out.println("나는 권용근.");
        System.out.println(
                "난 매일아침 눈을 뜨자마자 나의 " + mp3.getName() + "로 음악을 듣지."
        );
        mp3.play();
        System.out.println("이 노래 말고..");
        mp3.next();
        System.out.println("좋군..!");
        System.out.println(
                "일상을 거닐며 아름다운 자연을 나의 " + camera.getName() + "로 담아."
        );
        camera.snapshot();
        
        System.out.println(
                "그리고 미국에 있는 투자자에게 나의 " + mobile.getName() + "으로 전화를 걸어 프로페셔널한 업무 이야기를 하지."
        );
        mobile.call();
        System.out.println("바쁜가보군.. 문자를 남겨야지");
        mobile.sendMessage();
    }
}
