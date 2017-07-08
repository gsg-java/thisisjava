package gs3.nekisse.machine.abstracts.audio;

import gs3.nekisse.machine.abstracts.audio.impl.CdPlayer;
import gs3.nekisse.machine.abstracts.audio.impl.Mp3;
import gs3.nekisse.machine.abstracts.machine_interface.impl.BluetoothSpeakerAudioAndCellPhone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class AudioPlay {
   public void mp3(Mp3 mp3){
       mp3.machineUse();
       mp3.powerOn();
       mp3.volumeup(new BluetoothSpeakerAudioAndCellPhone());
       mp3.play();
       mp3.mp3Fm();
       mp3.volumeDown(new BluetoothSpeakerAudioAndCellPhone());
       mp3.powerOff();
       System.out.println();
    }

    public void cdPlayer(CdPlayer cdPlayer){
        cdPlayer.machineUse();
        cdPlayer.powerOn();
        cdPlayer.play();
        cdPlayer.cdPlay();
        cdPlayer.powerOff();
        System.out.println();
    }
}
