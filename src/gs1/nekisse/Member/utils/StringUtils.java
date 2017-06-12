package gs1.nekisse.Member.utils;

/**
 * Created by Nekisse_lee on 2017. 6. 11..
 */
public class StringUtils {
    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            System.out.println("숫자만 입력가능합니다");
            return false;
        }
    }
}
