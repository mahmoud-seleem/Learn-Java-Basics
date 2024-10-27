import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int counter = 10;
        int x = 0;
        while(x < counter){
            System.out.print("Enter an integer: ");
            x = input.nextInt();
        }
    }
}

