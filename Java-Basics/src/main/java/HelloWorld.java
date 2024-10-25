import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("enter the first number to add : ");
        float x = input.nextFloat();
        System.out.print("enter the second number to add : ");
        float y = input.nextFloat();
        System.out.printf("The sum is : %f" , x%y);
    }
}
