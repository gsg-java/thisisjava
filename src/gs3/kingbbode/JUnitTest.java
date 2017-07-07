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
import gs3.kingbbode.step5.Galaxy;
import gs3.kingbbode.step5.IPhone;
import gs3.kingbbode.step6.NewGalaxy;
import gs3.kingbbode.step6.NewIPhone;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by YG on 2017-07-07.
 */
public class JUnitTest {
    private String[] playList;
    private Kingbbode kingbbode;
    private Minho minho;
    
    @Before
    public void setup(){
        playList = new String[]{"암쏘소리벗알러뷰다거짓말, 이야 몰랐어","하루하루 멀어져가네에에에","너의 눈,코,입"};
    }
    
    @Test
    public void step1() {
        IRiver01 iRiver01 = new IRiver01(playList);
        Assert.assertThat(iRiver01 instanceof MP3, is(true));
        IPot01 iPot01 = new IPot01(playList);
        Assert.assertThat(iPot01 instanceof MP3, is(true));
        NikonD40 nikonD40 = new NikonD40();
        Assert.assertThat(nikonD40 instanceof Camera, is(true));
        Canon400D canon400D = new Canon400D();
        Assert.assertThat(canon400D instanceof Camera, is(true));
        Cyon cyon = new Cyon();
        Assert.assertThat(cyon instanceof Mobile, is(true));
        Anicall anicall = new Anicall();
        Assert.assertThat(anicall instanceof Mobile, is(true));
        kingbbode = new Kingbbode(new MP3[]{iRiver01, iPot01}, new Camera[]{nikonD40, canon400D}, new Mobile[]{cyon, anicall});
        minho = new Minho(new MP3[]{iRiver01, iPot01}, new Camera[]{nikonD40, canon400D}, new Mobile[]{cyon, anicall});
    }

    @Test
    public void step2(){
        IRiverMP3Impl iRiver01 = new IRiverMP3Impl("IRiver-001", playList);
        Assert.assertThat(iRiver01 instanceof MP3, is(true));
        IPotMP3Impl iPot01 = new IPotMP3Impl("IPot 1세대", playList);
        Assert.assertThat(iPot01 instanceof MP3, is(true));
        NikonCameraImpl nikonD40 =  new NikonCameraImpl("Nikon D40");
        Assert.assertThat(nikonD40 instanceof Camera, is(true));
        CanonCameraImpl canon400D = new CanonCameraImpl("Canon 400D");
        Assert.assertThat(canon400D instanceof Camera, is(true));
        CyonMobileImpl cyon = new CyonMobileImpl("Cyon");
        Assert.assertThat(cyon instanceof Mobile, is(true));
        AnicallMobileImpl anicall = new AnicallMobileImpl("Anicall");
        Assert.assertThat(anicall instanceof Mobile, is(true));
        kingbbode = new Kingbbode(new MP3[]{ iRiver01, iPot01}, new Camera[]{ nikonD40, canon400D}, new Mobile[]{cyon, anicall});
        minho = new Minho(new MP3[]{ iRiver01, iPot01}, new Camera[]{ nikonD40, canon400D}, new Mobile[]{cyon, anicall});
    }

    @Test
    public void step3(){
        NewIRiver01 iRiver01 = new NewIRiver01(playList);
        Assert.assertThat(iRiver01 instanceof MP3, is(true));
        NewIPot01 iPot01 = new NewIPot01(playList);
        Assert.assertThat(iPot01 instanceof MP3, is(true));
        NewNikonD40 nikonD40 =  new NewNikonD40();
        Assert.assertThat(nikonD40 instanceof Camera, is(true));
        NewCanon400D canon400D = new NewCanon400D();
        Assert.assertThat(canon400D instanceof Camera, is(true));
        NewCyon cyon = new NewCyon();
        Assert.assertThat(cyon instanceof Mobile, is(true));
        NewAnicall anicall = new NewAnicall();
        Assert.assertThat(anicall instanceof Mobile, is(true));
        kingbbode = new Kingbbode(new MP3[]{ iRiver01, iPot01}, new Camera[]{ nikonD40, canon400D}, new Mobile[]{cyon, anicall});
        minho = new Minho(new MP3[]{ iRiver01, iPot01}, new Camera[]{ nikonD40, canon400D}, new Mobile[]{cyon, anicall});
    }

    @Test
    public void step4(){
        NewIRiver01 iRiver01 = new NewIRiver01(playList);
        Assert.assertThat(iRiver01 instanceof MP3, is(true));
        NewIPot01 iPot01 = new NewIPot01(playList);
        Assert.assertThat(iPot01 instanceof MP3, is(true));
        Lazer lazer =  new Lazer();
        Assert.assertThat(lazer instanceof Camera, is(true));
        Assert.assertThat(lazer instanceof Mobile, is(true));
        Chocolate chocolate = new Chocolate();
        Assert.assertThat(chocolate instanceof Camera, is(true));
        Assert.assertThat(chocolate instanceof Mobile, is(true));
        kingbbode = new Kingbbode(new MP3[]{ iRiver01, iPot01}, new Camera[]{ lazer, chocolate}, new Mobile[]{lazer, chocolate});
        minho = new Minho(new MP3[]{ iRiver01, iPot01}, new Camera[]{ lazer, chocolate}, new Mobile[]{lazer, chocolate});
    }

    @Test
    public void step5(){
        IPhone iPhone =  new IPhone(playList);
        Assert.assertThat(iPhone instanceof Camera, is(true));
        Assert.assertThat(iPhone instanceof Mobile, is(true));
        Assert.assertThat(iPhone instanceof MP3, is(true));
        Galaxy galaxy =  new Galaxy(playList);
        Assert.assertThat(galaxy instanceof Camera, is(true));
        Assert.assertThat(galaxy instanceof Mobile, is(true));
        Assert.assertThat(galaxy instanceof MP3, is(true));
        kingbbode = new Kingbbode(new MP3[]{ iPhone, galaxy}, new Camera[]{ iPhone, galaxy}, new Mobile[]{iPhone, galaxy});
        minho = new Minho(new MP3[]{ iPhone, galaxy}, new Camera[]{ iPhone, galaxy}, new Mobile[]{iPhone, galaxy});
    }

    @Test
    public void step6(){
        NewIPhone iPhone =  new NewIPhone(playList);
        Assert.assertThat(iPhone instanceof Camera, is(true));
        Assert.assertThat(iPhone instanceof Mobile, is(true));
        Assert.assertThat(iPhone instanceof MP3, is(true));
        NewGalaxy galaxy =  new NewGalaxy(playList);
        Assert.assertThat(galaxy instanceof Camera, is(true));
        Assert.assertThat(galaxy instanceof Mobile, is(true));
        Assert.assertThat(galaxy instanceof MP3, is(true));
        kingbbode = new Kingbbode(new MP3[]{ iPhone, galaxy}, new Camera[]{ iPhone, galaxy}, new Mobile[]{iPhone, galaxy});
        minho = new Minho(new MP3[]{ iPhone, galaxy}, new Camera[]{ iPhone, galaxy}, new Mobile[]{iPhone, galaxy});
    }
    
    @After
    public void test(){
        kingbbode.TellMeAboutYourLife();
        System.out.println("--------------------");
        minho.TellMeAboutYourLife();
    }
}
