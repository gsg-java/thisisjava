package Member;

import java.lang.reflect.Method;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class program {
    public static void main(String[] args) {
        for(Method method : A1.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(A.class)){
            }
            A annotation = method.getAnnotation(A.class);
            System.out.println( annotation.name());
        }

        MemberExample gogo = new MemberExample();
        gogo.run();
    }
}
