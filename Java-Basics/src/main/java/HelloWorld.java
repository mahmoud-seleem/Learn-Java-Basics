import OOP.polymorphism.Closable;

public class HelloWorld implements Closable{
    public static String name = "hello";
    public static void main(String[] args) {
        Closable closable = new HelloWorld();
    }

    public void close(){

    }
}

