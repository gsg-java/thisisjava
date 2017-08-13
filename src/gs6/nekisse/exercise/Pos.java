package gs6.nekisse.exercise;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 12..
 */
public class Pos {
    Scanner scanner = new Scanner(System.in);
    private Menu menu;
    private Admin admin = new Admin();
    public Pos() {
        this.menu = new Menu();
    }



    public void start(){
        System.out.println("포스 시스템 시작");
        boolean run = true;
        while (run){
            System.out.println("1. 주문모드 |  2. 관리자모드 | 3. 포스종료");
            int selectNum = scanner.nextInt();
            switch (selectNum){
                case 1:

                    break;
                case 2:
                    admin.start();
                    break;
                case 3:
                    run=false;
                    break;
            }
            System.out.println("포스를 종료합니다.");
            return;
        }
    }

}
