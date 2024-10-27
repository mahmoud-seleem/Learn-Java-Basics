import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int counter = 10;
        int x;
        while (true) {
            System.out.println("Enter number");
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(1);
                    break;
                default:
                    System.out.println("Default");
                case 2:
                    System.out.println(2);
                    break;
            }
        }
    }
}

