package OOP.lambda;

public class Demo {
  private String name = "hi";
  public static void main(String[] args) {
    Runnable r = new Demo().runing();
    r.run();
  }
  Runnable runing(){
    String name;
    return () -> System.out.println(this.name);
  }
}