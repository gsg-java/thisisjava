package gs3.nekisse.machine.abstracts.audio.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class CdPlayer extends Audio {
    public CdPlayer(String brand, String type, String name) {
        super(brand, type, name);

    }

    public void cdPlay(){
        System.out.println(brand + " " + name + type +  "을 사용하여  박효신1집 CD를 넣고 노래를 재생합니다.");

    }

}
