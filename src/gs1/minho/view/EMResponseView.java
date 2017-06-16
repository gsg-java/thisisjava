package gs1.minho.view;

import gs1.minho.annotation.ResponseView;
import gs1.minho.model.Emplyee;

import java.util.Map;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 9..
 */
public class EMResponseView extends EMView {
    @ResponseView(comment = "Register Request 의 결과 화면", request = "Register")
    public void registerRes(Object object) {
        Emplyee employee = (Emplyee) object;
        System.out.println(employee);
        System.out.println("------------------------등록완료--------------------------");
    }

    @ResponseView(comment = "Delete Request 의 결과 화면", request = "Delete")
    public void deleteRes(Object object) {
        Emplyee emplyee = (Emplyee) object;
        System.out.println(emplyee);
        System.out.println("------------------------삭제완료--------------------------");
    }

    @ResponseView(comment = "ShowAll Request 의 결과 화면", request = "ShowAll")
    public void showAllRes(Object object) {
        System.out.println("------------------------조회완료--------------------------");
        Map<String, Emplyee> employeeMap = (Map<String, Emplyee>) object;
        for (String name : employeeMap.keySet()) {
            System.out.println(employeeMap.get(name));
        }
        System.out.println("--------------------------------------------------------");
    }

    @ResponseView(comment = "SearchByName Request 의 결과 화면", request = "SearchByName")
    public void searchByNameRes(Object object) {
        System.out.println("------------------------검색완료--------------------------");
        Emplyee employee = (Emplyee) object;
        System.out.println(employee);
        System.out.println("--------------------------------------------------------");
    }
}
