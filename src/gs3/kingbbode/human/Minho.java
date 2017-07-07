package gs3.kingbbode.human;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG on 2017-07-04.
 */
public class Minho extends AbstractHuman{

    public Minho(MP3[] mp3, Camera[] camera, Mobile[] mobile) {
        super(mp3, camera, mobile);
    }

    @Override
    public void TellMeAboutYourLife(){
        System.out.println("나는 오민호.");
        System.out.println(
                "잠자기 전 내 마음을 안정시키기 위해 \u001B[31m" + mp3.getName() + "\u001B[0m로 음악을 듣지."
        );
        mp3.play();
        System.out.println("이 노래 말고..");
        mp3.next();
        System.out.println("zzzZ");
        System.out.println(
                "나는 나의 아름다운 모습을 \u001B[31m" + camera.getName() + "\u001B[0m로 담아."
        );
        camera.snapshot();
        
        System.out.println(
                "오늘도 소개팅 어플을 통해 그녀들에게 \u001B[31m" + mobile.getName() + "\u001B[0m으로 문자를 보내."
        );
        mobile.sendMessage();
        System.out.println("전화해야지!");
        mobile.call();

    }
}
