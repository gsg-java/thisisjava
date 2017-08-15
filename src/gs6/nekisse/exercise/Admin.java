package gs6.nekisse.exercise;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 13..
 */
public class Admin {
    Scanner scanner = new Scanner(System.in);
    private Pos pos;
    private Menu menu = new Menu();
    public void start() {
        System.out.println("관리자 모드입니다. \n 메뉴를 선택해 주세요.");

        boolean run = true;
        while (run){
            System.out.println("1.메뉴 추가| 2. 메뉴 삭제| 3.  메뉴 조회  | 4. 남은 잔고 | 5. 매출 | 6. 종료" );
           int selectnum= scanner.nextInt();
            switch (selectnum){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    break;
                case 5:
                    run = false;
                    break;

            }
        }
    }

    private void add() {
        String name = null;
        Integer price = null;
        Categorys categorys = null;


    }

    private void delete() {
        System.out.print("삭제할 메뉴 이름: ");
        String name = null;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        MenuItem menuItem = menu.findByName(name);
        menu.delete(menuItem);
        System.out.println(name + "을 삭제 하였습니다.");
    }

    private void search() {
        menu.findAll()
                .stream()
                .map(MenuItem::toString)
                .forEach(System.out::println);
    }



}
