package gs1.str333.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author str333
 * @date 2017. 6. 17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // on class level
public @interface SelectAnnotation {
	int number();
}
