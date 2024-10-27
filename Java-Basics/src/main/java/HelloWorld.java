import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        Scanner input =  new Scanner(System.in);
        int counter = 10;
        int x = input.nextInt();
        do{
            System.out.println(counter);
            x++;
        }
        while (x < counter);
    }
}

