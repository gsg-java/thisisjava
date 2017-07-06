package gs3.nekisse.machine.abstracts.machine_interface;

/**
 * Created by Nekisse_lee on 2017. 7. 6..
 */
public class WooferSpeakerAudioAndTv extends Speaker {
    @Override
    public void volumeUp() {
        System.out.println("오디오/티비 겸용 우퍼 피커의 볼륨을 높입니다");
    }

    @Override
    public void volumeDown() {
        System.out.println("오디오/티비 겸용 우퍼 피커의 볼륨을 줄입니다.");


    }
}
