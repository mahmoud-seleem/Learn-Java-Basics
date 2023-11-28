import java.util.Scanner;
public class HelloWorld {
    public static Scanner s = new Scanner(System.in);
    static {
        System.out.println("initialization is here ");
    }
    public static void main(String[] args) {
        System.out.print("hello, world");
        System.out.println(" hi");
        System.out.print("Enter the first number : ");
        int x = s.nextInt();
        System.out.print("Enter the second number : ");
        int y = s.nextInt();
        System.out.println("the Result is : "+(x+y));
    }
}
