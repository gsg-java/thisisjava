package gs3.kingbbode;

import gs3.kingbbode.human.Kingbbode;
import gs3.kingbbode.human.Minho;
import gs3.kingbbode.step1.*;
import gs3.kingbbode.step1.interfaces.Camera;
import gs3.kingbbode.step1.interfaces.MP3;
import gs3.kingbbode.step1.interfaces.Mobile;
import gs3.kingbbode.step2.*;
import gs3.kingbbode.step3.*;
import gs3.kingbbode.step4.Chocolate;
import gs3.kingbbode.step4.Lazer;
import gs3.kingbbode.step5.IPhone;
import gs3.kingbbode.step6.NewIPhone;

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
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("STEP 3");
        System.out.println("***********************************************");
        step3();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("STEP 4");
        System.out.println("***********************************************");
        step4();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("STEP 5");
        System.out.println("***********************************************");
        step5();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("STEP 6");
        System.out.println("***********************************************");
        step6();
    }
    
    private static void step1(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ new IRiver01(playList), new IPot01(playList)}, new Camera[]{ new NikonD40(), new Canon400D()}, new Mobile[]{new Cyon(), new Anicall()});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Minho minho = new Minho(new MP3[]{ new IRiver01(playList), new IPot01(playList)}, new Camera[]{ new NikonD40(), new Canon400D()}, new Mobile[]{new Cyon(), new Anicall()});
        minho.TellMeAboutYourLife();
    }
    
    private static void step2(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        Kingbbode kingbbode = new Kingbbode(new MP3[]{new IRiverMP3Impl("IRiver-001", playList), new IPotMP3Impl("IPot 1세대", playList)}, new Camera[]{new CanonCameraImpl("Canon 400D"), new NikonCameraImpl("Nikon D40")}, new Mobile[]{new CyonMobileImpl("Cyon"), new AnicallMobileImpl("Anicall")});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Minho minho = new Minho(new MP3[]{new IRiverMP3Impl("IRiver-001", playList), new IPotMP3Impl("IPot 1세대", playList)}, new Camera[]{new CanonCameraImpl("Canon 400D"), new NikonCameraImpl("Nikon D40")}, new Mobile[]{new CyonMobileImpl("Cyon"), new AnicallMobileImpl("Anicall")});
        minho.TellMeAboutYourLife();
    }

    private static void step3(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ new NewIRiver01(playList), new NewIPot01(playList)}, new Camera[]{ new NewNikonD40(), new NewCanon400D()}, new Mobile[]{new NewCyon(), new NewAnicall()});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Minho minho = new Minho(new MP3[]{ new NewIRiver01(playList), new NewIPot01(playList)}, new Camera[]{ new NewNikonD40(), new NewCanon400D()}, new Mobile[]{new NewCyon(), new NewAnicall()});
        minho.TellMeAboutYourLife();
    }
    
    private static void step4(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        Lazer lazer = new Lazer();
        Chocolate chocolate = new Chocolate();
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ new NewIRiver01(playList), new NewIPot01(playList)}, new Camera[]{ lazer, chocolate}, new Mobile[]{lazer, chocolate});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        Lazer lazer2 = new Lazer();
        Chocolate chocolate2 = new Chocolate();
        Minho minho = new Minho(new MP3[]{ new NewIRiver01(playList), new NewIPot01(playList)}, new Camera[]{ lazer2, chocolate2}, new Mobile[]{lazer2, chocolate2});
        minho.TellMeAboutYourLife();
    }

    private static void step5(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        IPhone iPhone = new IPhone(playList);
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ iPhone}, new Camera[]{ iPhone}, new Mobile[]{iPhone});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        IPhone iPhone2 = new IPhone(playList);
        Minho minho = new Minho(new MP3[]{ iPhone2}, new Camera[]{ iPhone2}, new Mobile[]{iPhone2});
        minho.TellMeAboutYourLife();
    }

    private static void step6(){
        String[] playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
        NewIPhone iPhone = new NewIPhone(playList);
        Kingbbode kingbbode = new Kingbbode(new MP3[]{ iPhone}, new Camera[]{ iPhone}, new Mobile[]{iPhone});
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        NewIPhone iPhone2 = new NewIPhone(playList);
        Minho minho = new Minho(new MP3[]{ iPhone2}, new Camera[]{ iPhone2}, new Mobile[]{iPhone2});
        minho.TellMeAboutYourLife();
    }
}
