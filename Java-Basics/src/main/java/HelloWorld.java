import java.util.Scanner;
public class HelloWorld {
    public static Scanner s = new Scanner(System.in);
    static {
        System.out.println("initialization is here ");
    }
    public static void main(String[] args) {
        boolean x = false;
        if (x){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}
