package gs3.nekisse.machine.abstracts.machine_interface.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 6..
 */
public class BluetoothSpeakerAudioAndCellPhone extends WooferSpeakerAudioAndTv {
    @Override
    public void volumeUp() {
        System.out.println("오디오 / 핸드폰 전용 블루투스 4.0 스피커를 연결해 볼륨을 높입니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("오디오 / 핸드폰 전용 블루투스 4.0 스피커를 연결해 볼륨을 낮춥니다..");


    }
}
