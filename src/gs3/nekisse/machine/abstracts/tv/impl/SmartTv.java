package gs3.nekisse.machine.abstracts.tv.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class SmartTv  extends Tv {
    public SmartTv(String brand, String type, String name) {
        super(brand, type, name);

    }

    public void internetTvUyoutube(){
        System.out.println(this.brand + this.name +  "을 사용하여  youtube를 봅니다.");

    }

}
