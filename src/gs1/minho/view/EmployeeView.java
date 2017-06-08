package gs1.minho.view;

import com.sun.org.apache.regexp.internal.RE;
import gs1.minho.annotation.RequestView;
import gs1.minho.annotation.ResponseView;
import gs1.minho.enums.CompanyPosition;
import gs1.minho.model.Emplyee;
import gs1.minho.request.RegisterRequest;
import gs1.minho.request.Request;
import gs1.minho.request.SearchByNameRequest;
import gs1.minho.request.ShowAllRequest;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * Created by minho on 2017. 6. 7..
 */

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    @RequestView(comment = "사원을 등록하기 위한 화면 입니다", value = 1)
    public Request registerReq() {
        System.out.println("------------------------사원등록--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        System.out.print("사원 직책 (1.사원 2.주임 3.대리 4.과장) : ");
        int pos = scanner.nextInt();
        CompanyPosition[] positions = CompanyPosition.values();
        return new RegisterRequest(name, positions[pos - 1]);
    }

    @RequestView(comment = "이름으로 사원을 검색하기 위한 화면 입니다", value = 5)
    public Request searchByNameReq() {
        System.out.println("------------------------사원검색--------------------------");
        System.out.print("검색할 사원 이름 : ");
        String name = scanner.nextLine();
        return new SearchByNameRequest(name);
    }

    @RequestView(comment = "", value = 4)
    public Request showAllReq() {
        return new ShowAllRequest();
    }


    @ResponseView(comment = "Register Request 의 결과 화면", request = "Register")
    public void registerRes(Object object) {
        if(object != null) {
            Emplyee employee = (Emplyee) object;
            System.out.println("이름 : " + employee.getName());
            System.out.println("직책 : " + employee.getPosition());
            System.out.println("------------------------등록완료--------------------------");
        } else {
            System.out.println("------------------------등록실패--------------------------");
        }
    }

    @ResponseView(comment = "ShowAll Request 의 결과 화면", request = "ShowAll")
    public void showAllRes(Object object) {
        if(object != null) {
            System.out.println("------------------------조회완료--------------------------");
            Map<String, Emplyee> employeeMap = (Map<String, Emplyee>) object;
            for (String name : employeeMap.keySet()) {
                System.out.println("이름 : " + name + " 직책 : " + employeeMap.get(name).getPosition());
            }
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("------------------------조회실패--------------------------");
        }
    }

    @ResponseView(comment = "SearchByName Request 의 결과 화면", request = "SearchByName")
    public void searchByNameRes(Object object) {
        if(object != null) {
            System.out.println("------------------------검색완료--------------------------");
            Emplyee employee = (Emplyee) object;
            System.out.println("이름 : " + employee.getName());
            System.out.println("직책 : " + employee.getPosition());
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("------------------------검색실패--------------------------");
        }
    }


    public int showMenu() {
        System.out.println("--------------------------------------------------------");
        System.out.println("1.사원등록 2.사원삭제 3.사원정보수정 4.사원전체조회 5.사원검색(이름기준)");
        System.out.println("--------------------------------------------------------");
        System.out.print("선택 > : ");
        int select = scanner.nextInt(); scanner.nextLine();
        return select;
    }
}