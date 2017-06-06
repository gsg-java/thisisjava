package Member;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class MemberExample {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> people = new ArrayList<String>();
    boolean start = true;

    public void run(){
        int munuNum = scanner.nextInt();

        switch (munuNum){
            case 1:
                 addmember(); break;
//            case 2:
//                modmember(); break;
//            case 3:
//                delmember(); break;
//            case 4:
//                searchmember(); break;
        }


    }

    public void addmember() {
        String name="";
        scanner.nextLine();
        System.out.println("직원 이름 : ex)홍길동  ");
        Member member = new Member(name);
        name = scanner.nextLine();
        people.add(member);

        System.out.println(people.get(0)+ " 생성하였습니다.");
    }


    }


