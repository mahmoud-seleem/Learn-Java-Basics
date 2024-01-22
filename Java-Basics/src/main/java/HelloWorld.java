import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("hello"));
    }
}



