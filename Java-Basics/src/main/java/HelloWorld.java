import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int counter = 10;
        final int CONST = 5;
        int x;
        while (true) {
            System.out.println("Enter number");
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(1);
                    break;
                case CONST:
                    System.out.println(CONST);
                    break;
                default:
                    System.out.println("Default");
                    break;
                case 2:
                    System.out.println(2);
                    break;
            }
        }
    }
}

