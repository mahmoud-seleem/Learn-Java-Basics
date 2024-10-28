import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printArray2(1,2,3);
    }
    public static void printArray2(int... elements){
        for(int x : elements){
            System.out.println(x);
        }
    }
    public static void printArray(int[] elements){
        for(int x : elements){
            System.out.println(x);
        }
    }

}

