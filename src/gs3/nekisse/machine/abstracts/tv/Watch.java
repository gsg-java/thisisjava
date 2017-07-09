package gs3.nekisse.machine.abstracts.tv;

import gs3.nekisse.machine.abstracts.cellphone.impl.SmartPhone;
import gs3.nekisse.machine.abstracts.machine_interface.impl.Speaker;
import gs3.nekisse.machine.abstracts.tv.impl.SmartTv;
import gs3.nekisse.machine.abstracts.tv.impl.Tv;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Watch {
    public  void watchTv(Tv tv){
        tv.machineUse();
        tv.powerOn();
        tv.volumeup(new Speaker());
        tv.wathTv();
        if (tv instanceof SmartTv){
            SmartTv smartTv = (SmartTv) tv;
            ((SmartTv) tv).internetTvUyoutube();
        }
        tv.volumeDown(new Speaker());
        tv.powerOff();
        System.out.println();

    }

}
