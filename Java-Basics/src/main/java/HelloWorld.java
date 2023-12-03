import java.util.Scanner;
public class HelloWorld {
    public static Scanner s = new Scanner(System.in);
    static {
        System.out.println("initialization is here ");
    }
    public static void main(String[] args) {
        int x = 6;
        switch(x){
            case 5:
                System.out.println("5");
                break;
        }
    }
}
