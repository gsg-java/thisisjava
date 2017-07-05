package gs3.nekisse.machine.abstracts.cellphone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Call {
    public void smartPhone(SmartPhone smartPhone){
        smartPhone.machineUse();
        smartPhone.powerOn();
        smartPhone.call();
        smartPhone.internetSearch();
        smartPhone.powerOff();
    }
    public void dmbPhone(DmbPhone dmbPhone){
        dmbPhone.machineUse();
        dmbPhone.powerOn();
        dmbPhone.call();
        dmbPhone.watchTv();
        dmbPhone.powerOff();
    }
}
