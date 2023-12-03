import java.util.Scanner;
public class HelloWorld {
    public static Scanner s = new Scanner(System.in);
    static {
        System.out.println("initialization is here ");
    }
    public static void main(String[] args) {
//        int x = Integer.MIN_VALUE +1000;
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toBinaryString(~x));
//        System.out.println(Integer.toBinaryString((~x) + 1 ));
//        System.out.println(Integer.toBinaryString(-x));
//        System.out.println(Integer.toBinaryString((x) / 2 ));
//        System.out.println(Integer.toBinaryString((x) >> 1));
        long x = Integer.MAX_VALUE + 10000L;
        System.out.println(Long.toBinaryString(x));
        System.out.println((float)x);
        System.out.println(Integer.MAX_VALUE);
        }
    }

