import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("강서구 자바 스터디!");

        List<String> a = new Test();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("1");

        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println(a.contains("3"));
        System.out.println(a.contains("6"));
        List<String> c = new Test();
        c.add("7");
        c.addAll(a);
        c.remove("4");
        test();
    }

    private static void test(){
        if(false){
            System.out.println("app");
        }
        System.out.println("test2");
    }
}
