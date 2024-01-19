package OOP.exceptionHandling;

import java.util.InputMismatchException;

public class Zero {
    public static void main(String[] args) throws Exception {
        try{try{
            div(10,0);
        }catch (ArithmeticException e ) {
            System.out.println("hi i'm the exception");
            throw new Exception("hi");
        }finally {
            System.out.println("hello from the finally block ");
        }}catch (Exception e){
            System.out.println("handling the exception");
        }
    }
    public static int div(int q1,int q2){
        return q1/q2;
    }
}
