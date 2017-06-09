package gs1.minho.view;

import gs1.minho.annotation.RequestView;
import gs1.minho.enums.CompanyPosition;
import gs1.minho.request.RegisterRequest;
import gs1.minho.request.Request;
import gs1.minho.request.SearchByNameRequest;
import gs1.minho.request.ShowAllRequest;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 9..
 */
public class EMRequestView extends EMView{
    @RequestView(comment = "사원 등록 화면", value = 0)
    public Request registerReq() {
        System.out.println("------------------------사원등록--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        System.out.print("사원 직책 (1.사원 2.주임 3.대리 4.과장) : ");
        int pos = scanner.nextInt();
        CompanyPosition[] positions = CompanyPosition.values();
        return new RegisterRequest(name, positions[pos - 1]);
    }

    @RequestView(comment = "사원 삭제 화면", value = 1)
    public Request deleteReq() {
        return null;
    }

    @RequestView(comment = "사원 수정 화면", value = 2)
    public Request modifyReq() {
        return null;
    }

    @RequestView(comment = "사원 전체 조회 화면, 현재는 아무것도 없고 후에 정렬 옵션을 넣을 것", value = 3)
    public Request showAllReq() {
        return new ShowAllRequest();
    }

    @RequestView(comment = "이름으로 사원을 검색하기 위한 화면", value = 4)
    public Request searchByNameReq() {
        System.out.println("------------------------사원검색--------------------------");
        System.out.print("검색할 사원 이름 : ");
        String name = scanner.nextLine();
        return new SearchByNameRequest(name);
    }
}
