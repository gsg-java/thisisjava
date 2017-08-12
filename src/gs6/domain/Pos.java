package gs6.domain;

import java.util.Scanner;

/**
 * Created by YG-MAC on 2017. 8. 12..
 */
public class Pos {
    private Menu menu;
    private Discount discount;

    public Pos() {
        this.menu = new Menu();
        this.discount = new Discount();
    }

    public void start() {
        //주문 시작
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //초기 포스시스템 기능 메뉴
            // 관리자 모드
            // 사용자 모드
        }
    }

    public void admin() {
        //menu.add
        //category//add
    }

    public void order() {
        Order order = new Order();
        String menuList = this.menu.print();
        System.out.println(menuList);
        /**
         * 1번 아메리카노
         * 2번 카페라떼
         */
        System.out.println("아이템을 골라주세요.");
        Item item = this.menu.findItemById();
        order.add(item);
        order.add(new Item("아이스 아메리카노", 1000));
        order.add(new Item("아이스 아메리카노", 1000));
        order.add(new Item("아이스 아메리카노", 1000));
        //할인율 골라
        //pos.discount.get(1);
        order.add(new DiscountItem("KT 할인", 5));
        //주문 끝
        order.calcPrice();
        //고객 돈 받고
        //그거 거슬러 주고
        //금고에 있는 돈 계산
    }
}
