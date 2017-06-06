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
        while (start) {
            System.out.println("----------------------------------------");
            System.out.println("1.사원생성 | 2.사원수정 | 3.사원삭제 | 4.사원조회");
            System.out.println("----------------------------------------");
            System.out.print("선택> ");

        int munuNum = scanner.nextInt();



          switch (munuNum) {
              case 1:
                  addmember();
                  break;
            case 2:
                modmember(); break;
            case 3:
                delmember(); break;
              case 4:
                  searchmember();
                  break;
          }
      }

    }




    public void addmember() {
        String name="";
        scanner.nextLine();
        System.out.println("직원 이름 : ex)홍길동  ");
        name = scanner.nextLine();
        people.add(name);

        System.out.println(name+ " 생성하였습니다.");
    }

    public void modmember() {
    }


    public void searchmember() {
        for (int i = 0; i < people.size(); i++) {
            String Allpeople = people.get(i);
            System.out.println("모든 사원을 조회합니다");
            System.out.println(i+ "번째 사원 : " + Allpeople);
        }
    }


    public void delmember() {
        String name="";
        scanner.nextLine();
        System.out.println("삭제할 직원 이름 : ex)홍길동 ");
        name = scanner.nextLine();
        people.remove(name);


    }


    }


