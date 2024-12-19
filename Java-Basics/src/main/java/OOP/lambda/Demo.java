package OOP.lambda;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;;
public class Demo {
    private static final String HELLO = "Hello";
    public static void main(String[] args) throws Exception {
        int x = (int)Math.random();
       Runnable r = () -> {};
       Runnable rr = () -> System.out.println();     
       System.out.println(r);
       System.out.println(rr);   
        }
}