package gs3.nekisse.machine.abstracts.audio;

import gs3.nekisse.machine.abstracts.audio.impl.Audio;
import gs3.nekisse.machine.abstracts.audio.impl.CdPlayer;
import gs3.nekisse.machine.abstracts.audio.impl.Mp3;
import gs3.nekisse.machine.abstracts.machine_interface.impl.BluetoothSpeakerAudioAndCellPhone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class AudioPlay {
   public void mp3(Audio audio){
       audio.machineUse();
       audio.powerOn();
       audio.volumeup(new BluetoothSpeakerAudioAndCellPhone());
       audio.play();
/*
       if(audio instanceof Mp3)
           ((Mp3)audio).mp3Fm();
       else if(audio instanceof CdPlayer)
           ((CdPlayer) audio).cdPlay();

*/


//        타입변환
       if(audio instanceof Mp3){
           Mp3 mp3 = (Mp3) audio;
           ((Mp3) audio).mp3Fm();

       }

       audio.volumeDown(new BluetoothSpeakerAudioAndCellPhone());
       audio.powerOff();
       System.out.println();
    }

    public void cdPlayer(Audio audio){
        audio.machineUse();
        audio.powerOn();
        audio.play();
        if (audio instanceof CdPlayer){
            CdPlayer cdPlayer = (CdPlayer) audio;
            ((CdPlayer) audio).cdPlay();
        }
        audio.powerOff();
        System.out.println();
    }
}
