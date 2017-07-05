package gs3.kingbbode.step2;

import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public class AnicallMobileImpl implements Mobile {
    private String name;

    public AnicallMobileImpl(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("뚜르..");
        System.out.println("르..");
        System.out.println("르르르");
    }

    @Override
    public void sendMessage() {
        System.out.println("SMS 서버 접속.");
        System.out.println("메시지 전송 중");
        System.out.println("메시지 전송 완료");
    }

    @Override
    public String getName() {
        return name;
    }
}
