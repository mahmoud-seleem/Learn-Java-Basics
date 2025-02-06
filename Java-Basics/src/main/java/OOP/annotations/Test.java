
package OOP.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;



public class Test {

    /**
     * 
     * Documentation 
     */
    @Demo(id = 10)
    public void testMethod() {
        System.out.println("hi from test method");

    }

    public static void main(String[] args) {
        Method[] methods = Test.class.getDeclaredMethods();
        for (Method method : methods){
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation a : annotations){
                System.out.println(a.annotationType().getSimpleName());
            }
        }
    }
}
