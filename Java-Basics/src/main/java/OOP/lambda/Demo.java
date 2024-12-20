package OOP.lambda;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;;
public class Demo extends Demo2{
    private static final String HELLO = "Hello";
    public static void main(String[] args) {
      Demo d = new Demo();
      d.main();
    }
    public void main() {
      Consumer<String> c = super::print; 
    }
    @Override
    public void print(String s){
      System.out.println(s);
    }

}
class Demo2{
  public void print(String s){}
}