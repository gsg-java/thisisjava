package Test;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Ano1Example {
    public static void main(String[] args) {
        String[] people =  new String[10];
        boolean run = true;


        for(Method method : Ano1.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(Ano.class)){
            }
            Ano annotation = method.getAnnotation(Ano.class);
            System.out.println( annotation.name());
        }

        Scanner scanner = new Scanner(System.in);

        Ano1 ano1 = new Ano1();
        while(run){

            System.out.print("입력란> ");

            int menuNum = scanner.nextInt();
            switch (menuNum){
                case 1 :
                    ano1.add();
                    System.out.println("추가할 인원을 입력해주세요 ex) 3명 = 3 입력후 엔터");
                    int num = scanner.nextInt();
                    System.out.println(num + "명을 1명씩 입력후 엔터 ex)\"과장\" 입력후 엔터");
                    for(int i=0; i<=num; i++){
                        people[i] = scanner.nextLine();
                    }
                    break;
                case 2 :
                    ano1.mod();
                    break;
                case 3 :
                    ano1.del();
                    for (int i = 0; i <= people.length; i ++)
                        if(people[i].equals(scanner.nextLine())){
                            people[i] = null;




                        }
                    break;
                case 4 :
                    ano1.search();
                    for (int i = 0; i < people.length; i++) {
                        System.out.println(people[i]);
                    }
            }

        }


    }

    }





