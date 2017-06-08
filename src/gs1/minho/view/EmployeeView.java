package gs1.minho.view;

import gs1.minho.annotation.MenuAnnotation;
import gs1.minho.annotation.RegisterAnnotation;
import gs1.minho.enums.CompanyPosition;
import gs1.minho.model.Emplyee;
import gs1.minho.request.RegisterRequest;
import gs1.minho.request.Request;

import java.util.Scanner;


/**
 *
 * Created by minho on 2017. 6. 7..
 */

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    @RegisterAnnotation(name = "registerEmp", serviceMethod = "register", value = 1)
    public Request registEmployee() {
        System.out.println("------------------------사원등록--------------------------");
        System.out.print("사원 이름 : ");
        String name = scanner.nextLine();
        System.out.print("사원 직책 (1.사원 2.주임 3.대리 4.과장) : ");
        int pos = scanner.nextInt();
        CompanyPosition[] positions = CompanyPosition.values();
        Request registerRequest = new RegisterRequest(name, positions[pos - 1]);

        return registerRequest;
    }

    @MenuAnnotation()
    public int ShowMenu() {
        System.out.println("--------------------------------------------------------");
        System.out.println("1.사원등록 2.사원삭제 3.사원정보수정 4.사원전체조회 5.사원검색(이름기준)");
        System.out.println("--------------------------------------------------------");
        System.out.print("선택 > : ");
        int select = scanner.nextInt(); scanner.nextLine();
        return select;
    }

    public void completeMessage(Emplyee employee) {
        System.out.println("이름 : " + employee.getName());
        System.out.println("직책 : " + employee.getPosition());
        System.out.println("------------------------등록완료--------------------------");
    }
}