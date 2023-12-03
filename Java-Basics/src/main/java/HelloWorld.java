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
        int x = 40;
        if (false){
            System.out.println();
        }
        lable:
        for (int i= 0 ;i<10;i++){
            for (int xx = 0 ;i<10;i++){
                break lable;
            }
        }
    }
}
