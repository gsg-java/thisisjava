package gs1.nekisse.Member.service;

import gs1.nekisse.Member.annotations.Menu;
import gs1.nekisse.Member.model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 11..
 */
public class MemberService {

    private Scanner scanner;
    private ArrayList<String> people;
    //권용근, Member


    public MemberService(Scanner scanner) {
        this.scanner = scanner;
        this.people = new ArrayList<>();
    }

    @Menu(name = "사원추가 : 1번 엔터")
    public void addMember() {
        String name;
        System.out.println("직원 이름 : ex)홍길동  ");
        name = scanner.nextLine();
        people.add(name);

        System.out.println(name + " 생성하였습니다.");
    }

    @Menu(name = "정보수정 : 2번 엔터")
    public void modMember() {
        String name;
        String after;
        System.out.println("수정할 사원의 이름을 적어주세요");
        name = scanner.nextLine();
        System.out.println("변경될 사원의 이름을 적어주세요");
        after = scanner.nextLine();
        this.people.set(this.people.indexOf(name), after);
        System.out.println(after + "를 수정했습니다");
    }

    @Menu(name = "사원삭제 : 3번 엔터")
    public void searchMember() {
        System.out.println("모든 사원을 조회합니다");
        for (int i = 0; i < people.size(); i++) {
            String AllPeople = people.get(i);
            System.out.println(i + "번째 사원 : " + AllPeople);
        }
    }

    @Menu(name = "사원조회 : 4번 엔터")
    public void delMember() {
        String name;
        System.out.println("삭제할 직원 이름 : ex)홍길동 ");
        name = scanner.nextLine();
               people.remove(name);
        }
}