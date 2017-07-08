package gs3.nekisse.machine.abstracts.audio.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Mp3 extends Audio {
    public Mp3(String brand, String type, String name) {
        super(brand, type, name);

    }

    public void mp3Fm(){
        System.out.println(brand + " " + name + type + "을 사용하여 Fm채널 컬투쇼를 청취합니다.");

    }


}
