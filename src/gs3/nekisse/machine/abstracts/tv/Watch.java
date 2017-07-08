package gs3.nekisse.machine.abstracts.tv;

import gs3.nekisse.machine.abstracts.machine_interface.impl.Speaker;
import gs3.nekisse.machine.abstracts.tv.impl.SmartTv;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Watch {
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
