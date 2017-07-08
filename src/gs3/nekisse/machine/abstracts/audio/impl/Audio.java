package gs3.nekisse.machine.abstracts.audio.impl;

import gs3.nekisse.machine.abstracts.Machine;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Audio extends Machine {


    public Audio(String brand, String type, String name) {
        super(brand, type, name);
    }

    public void play(){
        System.out.println(this.brand + this.name + "을 사용하여 노래를 재생합니다.");

    }
    }

