package gs1.kingbbode;

import gs1.kingbbode.annotations.Command;

import java.util.Scanner;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class Service {

    @Command(number = 1, name = "등록")
    public void insert(){
        //Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("등록 시작");
        System.out.println("등록 종료");
        System.out.println();
    }

    @Command(number = 2, name = "수정")
    public void update(){
        System.out.println();
        System.out.println("수정 시작");
        System.out.println("수정 종료");
        System.out.println();
    }

    @Command(number = 3, name = "삭제")
    public void delete(){
        System.out.println();
        System.out.println("삭제 시작");
        System.out.println("삭제 종료");
        System.out.println();
    }
}
