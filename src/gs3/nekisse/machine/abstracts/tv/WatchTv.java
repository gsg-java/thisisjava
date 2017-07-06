package gs3.nekisse.machine.abstracts.tv;

import gs3.nekisse.machine.abstracts.machine_interface.Speaker;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class WatchTv {
    public  void watchTv(SmartTv smartTv){
        smartTv.machineUse();
        smartTv.powerOn();
        smartTv.volumeup(new Speaker());
        smartTv.wathTv();
        smartTv.internetTvUyoutube();
        smartTv.volumeDown(new Speaker());
        smartTv.powerOff();
        System.out.println();

    }

}
