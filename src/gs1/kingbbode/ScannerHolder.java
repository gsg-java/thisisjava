package gs1.kingbbode;

import java.util.Scanner;

/**
 * Created by YG-MAC on 2017. 6. 9..
 */
public class ScannerHolder {
    public static Scanner scanner = new Scanner(System.in);

    public static String input(String message){
        System.out.print(message);
        return scanner.next();
    }
}
