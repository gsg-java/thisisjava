package gs3.nekisse.machine.abstracts.cellphone;

import gs3.nekisse.machine.abstracts.machine_interface.BluetoothSpeakerAudioAndCellPhone;
import gs3.nekisse.machine.abstracts.machine_interface.Speaker;
import gs3.nekisse.machine.abstracts.machine_interface.WooferSpeakerAudioAndTv;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Call {
    public void smartPhone(SmartPhone smartPhone){
        smartPhone.machineUse();
        smartPhone.powerOn();
        smartPhone.volumeup(new BluetoothSpeakerAudioAndCellPhone());
        smartPhone.call();
        smartPhone.internetSearch();
        smartPhone.volumeDown(new BluetoothSpeakerAudioAndCellPhone());
        smartPhone.powerOff();
        System.out.println();
    }
    public void dmbPhone(DmbPhone dmbPhone){
        dmbPhone.machineUse();
        dmbPhone.powerOn();
        dmbPhone.call();
        dmbPhone.watchTv();
        dmbPhone.powerOff();
        System.out.println();

    }
}
