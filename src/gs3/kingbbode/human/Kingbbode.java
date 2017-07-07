package gs3.kingbbode.human;

import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG on 2017-07-04.
 */
public class Kingbbode extends AbstractHuman{

    public Kingbbode(MP3[] mp3, Camera[] camera, Mobile[] mobile) {
        super(mp3, camera, mobile);
    }

    @Override
    public void TellMeAboutYourLife(){
        System.out.println("나는 권용근.");
        System.out.println(
                "난 매일아침 눈을 뜨자마자 나의 \u001B[31m" + mp3.getName() + "\u001B[0m로 음악을 듣지."
        );
        mp3.play();
        System.out.println("이 노래 말고..");
        mp3.next();
        System.out.println("좋군..!");
        System.out.println(
                "일상을 거닐며 아름다운 자연을 나의 \u001B[31m" + camera.getName() + "\u001B[0m로 담아."
        );
        camera.snapshot();
        
        System.out.println(
                "그리고 미국에 있는 투자자에게 나의 \u001B[31m" + mobile.getName() + "\u001B[0m으로 전화를 걸어 프로페셔널한 업무 이야기를 하지."
        );
        mobile.call();
        System.out.println("바쁜가보군.. 문자를 남겨야지");
        mobile.sendMessage();
    }
}
