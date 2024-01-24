package OOP.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Target(value = {ElementType.ANNOTATION_TYPE,ElementType.METHOD})
public @interface Demo {
    String value() default "";
}
