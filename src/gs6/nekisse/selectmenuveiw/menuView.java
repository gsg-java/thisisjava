package gs6.nekisse.selectmenuveiw;

import gs6.nekisse.selectmenuveiw.manager_view.managerView;
import gs6.nekisse.selectmenuveiw.user_view.userView;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class menuView {
    userView userView = new userView();
    managerView managerView = new managerView();

    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("카페 포스프로그램 시작");
        menuMode();
    }

    private void menuMode() {
        boolean run = true;
        while (run) {
            System.out.println("1. 사용자 주문 모드 |2. 관리자용 | 3. 프로그램종료");
            System.out.println("1 , 2 , 3 의 숫자중 하나를 입력해주세요");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    userView.userMenuMode();
                    run = false;
                    break;
                case 2:
                    managerView.managerMenuMode();
                    run = false;
                    break;
                case 3:
                    run = false;
            }
            System.out.println("프로그램을 종료합니다");
            return;
        }
    }


}
