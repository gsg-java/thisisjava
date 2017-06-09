package gs1.minho.view;

import gs1.minho.annotation.ErrorView;
import gs1.minho.annotation.RequestView;
import gs1.minho.annotation.ResponseView;
import gs1.minho.enums.CompanyPosition;
import gs1.minho.model.Emplyee;
import gs1.minho.request.RegisterRequest;
import gs1.minho.request.Request;
import gs1.minho.request.SearchByNameRequest;
import gs1.minho.request.ShowAllRequest;

import java.util.Map;
import java.util.Scanner;


/**
 *
 * Created by minho on 2017. 6. 7..
 */

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    @RequestView(comment = "사원을 등록하기 위한 화면", value = 1)
    public Request registerReq() {
        System.out.println("------------------------사원등록--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        System.out.print("사원 직책 (1.사원 2.주임 3.대리 4.과장) : ");
        int pos = scanner.nextInt();
        CompanyPosition[] positions = CompanyPosition.values();
        return new RegisterRequest(name, positions[pos - 1]);
    }

    @RequestView(comment = "사원 전체 조회에 따른 화면, 현재는 아무것도 없고 후에 정렬 옵션을 넣을 것", value = 4)
    public Request showAllReq() {
        return new ShowAllRequest();
    }

    @RequestView(comment = "이름으로 사원을 검색하기 위한 화면", value = 5)
    public Request searchByNameReq() {
        System.out.println("------------------------사원검색--------------------------");
        System.out.print("검색할 사원 이름 : ");
        String name = scanner.nextLine();
        return new SearchByNameRequest(name);
    }

    @ResponseView(comment = "Register Request 의 결과 화면", request = "Register")
    public void registerRes(Object object) {
        Emplyee employee = (Emplyee) object;
        System.out.println("이름 : " + employee.getName());
        System.out.println("직책 : " + employee.getPosition());
        System.out.println("------------------------등록완료--------------------------");
    }

    @ResponseView(comment = "ShowAll Request 의 결과 화면", request = "ShowAll")
    public void showAllRes(Object object) {
        System.out.println("------------------------조회완료--------------------------");
        Map<String, Emplyee> employeeMap = (Map<String, Emplyee>) object;
        for (String name : employeeMap.keySet()) {
            System.out.println("이름 : " + name + " 직책 : " + employeeMap.get(name).getPosition());
        }
        System.out.println("--------------------------------------------------------");
    }

    @ResponseView(comment = "SearchByName Request 의 결과 화면", request = "SearchByName")
    public void searchByNameRes(Object object) {
        System.out.println("------------------------검색완료--------------------------");
        Emplyee employee = (Emplyee) object;
        System.out.println("이름 : " + employee.getName());
        System.out.println("직책 : " + employee.getPosition());
        System.out.println("--------------------------------------------------------");
    }

    @ErrorView(comment = "Register Request 이 실패했을때 화면", request = "Register")
    public void registerReqFail(Request request) {
        System.out.println("-------------------------실패----------------------------");
        System.out.println(((RegisterRequest)request).getName() + "님은 이미 등록돼있습니다.");
        System.out.println("--------------------------------------------------------");
    }

    @ErrorView(comment = "SearchByName Request 이 실패했을때 화면", request = "SearchByName")
    public void searchByNameReqFail(Request request) {
        System.out.println("-------------------------실패----------------------------");
        System.out.println(((SearchByNameRequest)request).getName() + "님은 등록돼있지않습니다 ");
        System.out.println("--------------------------------------------------------");
    }

    @ErrorView(comment = "ShowAll Request 이 실패했을때 화면", request = "ShowAll")
    public void showAllReqFail(Request request) {
        System.out.println("-------------------------실패----------------------------");
        System.out.println("등록 되어 있는 사원이 없습니다.");
        System.out.println("--------------------------------------------------------");
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