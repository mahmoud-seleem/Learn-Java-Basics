package OOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

//@Target(value = {ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Demo
public @interface Demo {
    String value() default "";
}


class DD{

    @Demo
     void mm(){
        @Demo int x;
    }
}
