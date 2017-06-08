package gs1.minho.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestView {
   String comment();
   int value() default 0;
}
