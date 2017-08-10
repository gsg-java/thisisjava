package gs6.nekisse.selectmenuveiw.manager_view;

import gs6.nekisse.menu.cafeMenu;
import gs6.nekisse.menu.menuCategory;

import java.util.*;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public class managerView {
    Scanner scanner = new Scanner(System.in);
    Map<menuCategory, cafeMenu> menu = new HashMap<>();


    public void managerMenuMode() {
        System.out.println("관리자 모드입니다.");
        System.out.println("1. 메뉴 추가 삭제 조회| 2. 매출 정산 | 3. 카테고리 추가삭제 | 4. 포스 잔고");
            boolean run = true;
            while (run) {
                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                         menuAddDel();
                        break;

                }
                System.out.println("프로그램을 종료합니다");
                return;
        }
    }


    private void menuAddDel(){
        boolean run = true;
        while (run) {
            System.out.println("1.메뉴추가 | 2. 메뉴 삭제 | 3. 메뉴 조회");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    menuAdd();
                    break;
                case 2:
                    menuDel();
                    break;
                case 3:
                   // menuAll();
                    break;
            }
        }

    }


/*    private String messageInput(Scanner scanner, String message){
        sout(message);
        return scanner.nextLine();
    }

...
        map.put(messageInput("aaa"), messageInput("bbb"));*/

    private void menuAdd() {
        String categoryName = null;
        String menuName = null;
        Integer menuPrice = null;
        while(true) {
            System.out.print("추가 메뉴 이름: ");
            categoryName = scanner.next();
           /* menuCategory[] categories = menuCategory.values();
            for (menuCategory category : categories) {
                System.out.println(category);
            }

            menuName = scanner.nextLine();
            System.out.println();
            System.out.print("추가한" + menuName + "의 가격: ");
            menuPrice = scanner.nextInt();*/
            menu.put(menuCategory.valueOf(categoryName), new cafeMenu(menuName,menuPrice));
        }
    }

    private void menuDel() {
    }

    /*private void menuAll() {
        Set<String> menuKeys = menu.keySet();
        Iterator<String> menyKeyiteraor =menuKeys.iterator();
        while (menyKeyiteraor.hasNext()){
            String key = menyKeyiteraor.next();
            Integer price = menu.get(key);
            System.out.println(key + price);
        }
    }*/

}
