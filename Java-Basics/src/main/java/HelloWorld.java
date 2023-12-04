import java.util.Scanner;
public class HelloWorld {
    public static Scanner s = new Scanner(System.in);
    static {
        System.out.println("initialization is here ");
    }
    public static void main(String[] args) {
        int x[][] = new int[4][5];
        m(1,2);
    }
    public static void m(double y,double... x){
        System.out.println(x.length);
    }
    public static void m(double... x){
        System.out.println(x.length);
    }


}
