import OOP.polymorphism.Closable;

public class HelloWorld implements Closable{
    public static String name = "hello";
    public static void main(String[] args) {
      char c = 0x0111;
      char x = 0x0011;
      char z = (char) (c | x);
    }  

    public void close(){

    }
}

