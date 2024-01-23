package OOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Demo

public @interface Demo {
}


class DD{

    @Demo
     void mm(){

    }
}
