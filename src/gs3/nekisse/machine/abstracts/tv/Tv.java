package gs3.nekisse.machine.abstracts.tv;

import gs3.nekisse.machine.abstracts.Machine;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Tv extends Machine {
    String brand;
    String type;
    String name;


    protected Tv(String brand, String type, String name) {
        super(brand, type, name);
    }

    void wathTv(){
        System.out.println(this.name + this.type + "을 사용하여 티비를 시청 합니다.");

    }

    }
