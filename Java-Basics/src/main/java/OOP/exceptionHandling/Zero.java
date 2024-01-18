package OOP.exceptionHandling;

import java.util.InputMismatchException;

public class Zero {
    public static void main(String[] args) {
        try{
            div(10,0);
        }catch (ArithmeticException e ){
            System.out.println(e.getClass());
        }
    }
    public static int div(int q1,int q2){
        return q1/q2;
    }
}
