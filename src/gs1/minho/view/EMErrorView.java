package gs1.minho.view;

import gs1.minho.annotation.ErrorView;
import gs1.minho.request.RegisterRequest;
import gs1.minho.request.Request;
import gs1.minho.request.SearchByNameRequest;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 9..
 */
public class EMErrorView extends EMView {
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
}
