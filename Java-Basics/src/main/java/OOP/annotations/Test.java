package OOP.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import test.demo;

public class Test {

    @Demo(id = 10)
    void testMethod() {
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
