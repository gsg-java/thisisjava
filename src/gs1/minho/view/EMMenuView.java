package gs1.minho.view;

import gs1.minho.annotation.MenuView;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 9..
 */
public class EMMenuView extends EMView{
    @MenuView(comment = "초기 메뉴 화면")
    public int showMenu() {
        System.out.println("--------------------------------------------------------");
        System.out.println("1.사원등록 2.사원삭제 3.사원정보수정 4.사원전체조회 5.사원검색(이름기준)");
        System.out.println("--------------------------------------------------------");
        System.out.print("선택 > : ");
        int select = scanner.nextInt(); scanner.nextLine();
        return select - 1;
    }
}
