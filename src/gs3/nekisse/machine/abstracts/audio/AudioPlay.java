package gs3.nekisse.machine.abstracts.audio;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class AudioPlay {
   public void mp3(Mp3 mp3){
       mp3.machineUse();
       mp3.powerOn();
       mp3.play();
       mp3.mp3Fm();
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
