package gs4.minho;

import java.util.Scanner;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 12..
 */
public class MinhoCalculator {
    public static void main(String[] argc) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("식 입력 : ");
//        String source = scanner.nextLine();
//        System.out.print(source);

        MinhoInteger two = new MinhoInteger(2);
        MinhoInteger one = new MinhoInteger(4);

        System.out.print(one.plus(two));
    }
}

