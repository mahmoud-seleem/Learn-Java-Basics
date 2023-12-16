package OOP.exceptionHandling;

import java.util.InputMismatchException;

public class Zero {
    public static void main(String[] args) {
        try {
            System.out.println(div(1,0));
        }catch (ArithmeticException | InputMismatchException ee){
            System.out.println(ee.getMessage());
        }
    }
    public static int div(int q1,int q2) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        return q1/q2;
    }
}
