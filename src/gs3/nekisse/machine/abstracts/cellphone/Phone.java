package gs3.nekisse.machine.abstracts.cellphone;

import gs3.nekisse.machine.abstracts.Machine;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Phone extends Machine {
    String brand;
    String type;
    String name;


    public Phone(String brand, String type, String name) {
        super(brand, type, name);
        this.brand =brand;
        this.type =type;
        this.name = name;
    }

    public void call(){
        System.out.println(name + type + "을 사용하여 전화를 겁니다.");
    }
}
