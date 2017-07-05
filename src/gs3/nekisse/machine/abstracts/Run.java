package gs3.nekisse.machine.abstracts;

import gs3.nekisse.machine.abstracts.audio.CdPlayer;
import gs3.nekisse.machine.abstracts.audio.Mp3;
import gs3.nekisse.machine.abstracts.audio.AudioPlay;
import gs3.nekisse.machine.abstracts.cellphone.Call;
import gs3.nekisse.machine.abstracts.cellphone.DmbPhone;
import gs3.nekisse.machine.abstracts.cellphone.SmartPhone;
import gs3.nekisse.machine.abstracts.tv.SmartTv;
import gs3.nekisse.machine.abstracts.tv.WatchTv;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Run {
    public static void main(String[] args) {
        AudioPlay play =new AudioPlay();
        Call call = new Call();
        WatchTv watchTv =new WatchTv();

        play.mp3(new Mp3("아이리버","mp3","IR-100"));
        play.cdPlayer(new CdPlayer("파나소닉","cdP","CDP-100"));

        call.dmbPhone(new DmbPhone("삼성", "디엠비폰","Galaxy1"));
        call.smartPhone(new SmartPhone("엘지","스마트폰","G6"));

        watchTv.watchTv(new SmartTv("엘지","스마트티비","LG-IPS333"));
    }

}
