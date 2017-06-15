package gs1.nekisse.Member;

import gs1.nekisse.Member.controller.Controller;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Program {
    public static void main(String[] args) {
        new Controller(new Scanner(System.in)).run();
    }
}
