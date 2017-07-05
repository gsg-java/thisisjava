package gs3.kingbbode;

import gs3.kingbbode.step1.*;
import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;
import gs3.kingbbode.step2.*;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("STEP 1");
        System.out.println("***********************************************");
        step1();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("STEP 2");
        System.out.println("***********************************************");
        step2();
    }
    
    private static void step1(){
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ new IRiver01(), new IPot01()}, new Camera[]{ new NikonD40(), new Canon400D()}, new Mobile[]{new Lazer(), new Anicall()});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Minho minho = new Minho(new MP3[]{ new IRiver01(), new IPot01()}, new Camera[]{ new NikonD40(), new Canon400D()}, new Mobile[]{new Lazer(), new Anicall()});
        minho.TellMeAboutYourLife();
    }
    
    private static void step2(){
        Kingbbode kingbbode = new Kingbbode(new MP3[]{new IRiverMP3Impl("IRiver-001"), new IPotMP3Impl("IPot 1세대")}, new Camera[]{new CameraImpl("Canon 400D"), new CameraImpl("Nikon D40")}, new Mobile[]{new LazerMobileImpl("Lazer"), new AnicallMobileImpl("Anicall")});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Minho minho = new Minho(new MP3[]{new IRiverMP3Impl("IRiver-001"), new IPotMP3Impl("IPot 1세대")}, new Camera[]{new CameraImpl("Canon 400D"), new CameraImpl("Nikon D40")}, new Mobile[]{new LazerMobileImpl("Lazer"), new AnicallMobileImpl("Anicall")});
        minho.TellMeAboutYourLife();
    }
}
