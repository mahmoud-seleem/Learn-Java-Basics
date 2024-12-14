import OOP.polymorphism.Closable;

public class HelloWorld implements Closable{
    public static String name = "hello";
    public static void main(String[] args) {
       double x = 0.1f;
       System.out.println(x);   
    }

    public void close(){

    }
}

