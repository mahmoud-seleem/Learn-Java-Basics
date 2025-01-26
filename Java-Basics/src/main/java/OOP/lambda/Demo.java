package OOP.lambda;

public class Demo {
  private String name = "hi";
  private int x = 10;
  public static void main(String[] args) {
    Runnable r = new Demo().runing();
    r.run();
  }

  Runnable runing(){
    String name = "";
    // return new Runnable() {
    //   String name = "hello";
    //   @Override
    //   public void run(){
    //     System.out.println();
    //   }
    // };
  
    return () -> {
      System.out.println(this.x);};
}

  
  }