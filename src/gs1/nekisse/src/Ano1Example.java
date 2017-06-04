import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Ano1Example {
    public static void main(String[] args) {
        int people = 0;
        boolean run = true;


        for(Method method : Ano1.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(Ano.class)){
            }
            Ano annotation = method.getAnnotation(Ano.class);
            System.out.println( " : " + annotation.name());
        }

        Scanner scanner = new Scanner(System.in);
        int menuNum = scanner.nextInt();
        Ano1 ano1 = new Ano1();
        while(run){
            System.out.println("------------------------------------");
            System.out.println("1.사원추가 | 2.수정 | 3.사원삭제 | 4.사원조회");
            System.out.println("------------------------------------");
            System.out.print("선택> ");


            switch (menuNum){
                case 1 :
                    ano1.add();
                    break;
                case 2 :
                    ano1.mod();
                    break;
                case 3 :
                    ano1.del();
                    break;
                case 4 :
                    ano1.search();

            }

        }

    }
}




