package gs3.nekisse.machine.abstracts.cellphone;

import gs3.nekisse.machine.abstracts.cellphone.impl.DmbPhone;
import gs3.nekisse.machine.abstracts.cellphone.impl.Phone;
import gs3.nekisse.machine.abstracts.cellphone.impl.SmartPhone;
import gs3.nekisse.machine.abstracts.machine_interface.impl.BluetoothSpeakerAudioAndCellPhone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Call {
    public void smartPhone(Phone phone){
        phone.machineUse();
        phone.powerOn();
        phone.volumeup(new BluetoothSpeakerAudioAndCellPhone());
        phone.call();
        if (phone instanceof SmartPhone){
            SmartPhone smartPhone = (SmartPhone) phone;
            ((SmartPhone) phone).internetSearch();
        }
        phone.volumeDown(new BluetoothSpeakerAudioAndCellPhone());
        phone.powerOff();
        System.out.println();
    }



    public void dmbPhone(Phone phone){
        phone.machineUse();
        phone.powerOn();
        phone.call();
        if (phone instanceof DmbPhone){
            DmbPhone dmbPhone = (DmbPhone) phone;
            ((DmbPhone) phone).watchTv();
        }
        phone.powerOff();
        System.out.println();

    }
}
