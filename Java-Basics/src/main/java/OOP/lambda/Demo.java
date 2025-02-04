package OOP.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
  private String name = "hi";
  private int x = 10;
  public static void main(String[] args) {
    Runnable r = new Demo().runing();
    r.run();
  }

  Runnable runing(){
    String name = "";
    return new Runnable() {
      String name = "hello";
      @Override
      public void run(){
        System.out.println(super.toString());
      }
    };
    
  
//     return () -> {
//       System.out.println(this.x);};
// }

  
  }
}