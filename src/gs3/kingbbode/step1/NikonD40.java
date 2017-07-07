package gs3.kingbbode.step1;

import gs3.kingbbode.step1.interfaces.Camera;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class NikonD40 implements Camera{
    @Override
    public void snapshot() {
        System.out.println("예열..");
        System.out.println("셔터 속도 조절...");
        System.out.println("..");
        System.out.println("...");
        System.out.println("초점 조절...");
        System.out.println("..");
        System.out.println("찰칵");
    }


    @Override
    public String getName() {
        return "Nikon D40";
    }
}
