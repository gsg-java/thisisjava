package gs1.nekisse.Member.controller;

import gs1.nekisse.Member.service.MemberService;
import gs1.nekisse.Member.annotations.Menu;
import gs1.nekisse.Member.utils.StringUtils;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Controller {

    public Controller(Scanner scanner) {
        this.scanner = scanner;
        StringBuilder menu = new StringBuilder();
        for(Method method : MemberService.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(Menu.class)){
                Menu annotation = method.getAnnotation(Menu.class);
                menu.append(annotation.name()).append("\n");
            }
        }
        this.menu = menu.toString();
        this.memberService = new MemberService(scanner);
    }

    private Scanner scanner;
    private String menu;

    private MemberService memberService;

    public void run(){
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println(this.menu);
            System.out.println("----------------------------------------");
            System.out.print("선택> ");

            String menuNum = scanner.nextLine();
            if(!StringUtils.isNum(menuNum)){
                System.out.println("숫자만 입력가능합니다");
                continue;
            }
            switch (menuNum) {
                case "1":
                    memberService.addMember();
                    break;
                case "2":
                    memberService.modMember();
                    break;
                case "3":
                    memberService.delMember();
                    break;
                case "4":
                    memberService.searchMember();
                    break;
            }

        }
    }
}


