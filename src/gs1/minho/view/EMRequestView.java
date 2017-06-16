package gs1.minho.view;

import gs1.minho.annotation.RequestView;
import gs1.minho.enums.CompanyPosition;
import gs1.minho.exception.MenuInputBoundaryOutException;
import gs1.minho.request.*;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 9..
 */
public class EMRequestView extends EMView {
    @RequestView(comment = "사원 등록 화면", value = 0)
    public Request registerReq() throws MenuInputBoundaryOutException {
        System.out.println("------------------------사원등록--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        System.out.print("사원 직책 (1.사원 2.주임 3.대리 4.과장) : ");
        int pos = scanner.nextInt();
        CompanyPosition position;
        switch (pos) {
            case 1:
                position = CompanyPosition.CLERK;
                break;
            case 2:
                position = CompanyPosition.SENIOR;
                break;
            case 3:
                position = CompanyPosition.ASSIST;
                break;
            case 4:
                position = CompanyPosition.MANAGER;
                break;
            default:
                throw new MenuInputBoundaryOutException("메뉴 입력 범위를 초과했습니다.");
        }
        return new RegisterRequest(name, position);
    }

    @RequestView(comment = "사원 삭제 화면", value = 1)
    public Request deleteReq() {
        System.out.println("------------------------사원삭제--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        return new DeleteRequest(name);
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
