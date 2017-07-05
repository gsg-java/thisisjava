package gs3.nekisse.machine.abstracts;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public abstract class Machine {
    String brand;
    String type;
    String name;

    public Machine(String brand, String type, String name){
        this.brand = brand;
        this.type= type;
        this.name = name;
    }


    public void machineUse(){
        System.out.println(this.brand+"회사의 " +"(" + this.type + ")" + this.name +" 사용을 시작합니다.");
    }


    public void powerOn(){
        System.out.println(name + "의 전원을 켭니다.");
    }

    public void powerOff(){
        System.out.println(name + "의 전원을 끕니다.");
    }

}
