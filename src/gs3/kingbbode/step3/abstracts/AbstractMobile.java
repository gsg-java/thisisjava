package gs3.kingbbode.step3.abstracts;

import gs3.kingbbode.step1.interfaces.Mobile;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public abstract class AbstractMobile implements Mobile {
    private String name;

    public AbstractMobile(String name) {
        this.name = name;
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
