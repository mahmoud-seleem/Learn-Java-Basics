package OOP.exceptionHandling;

import java.util.InputMismatchException;

public class Zero {
    public static void main(String[] args) throws Exception {
//        try{
//            div(10,10);
//        }catch (ArithmeticException e ) {
//            System.out.println("hi i'm the exception");
//            throw e;
//        }
        catchTheException(10,0);
    }
    public static void catchTheException(int x , int y){
        try{
            div(x,y);
        }catch (Exception e){
            throw new RuntimeException("new exception thrown from the catch in catch method",e);
        }
    }
    public static int div(int q1,int q2){
        return q1/q2;
    }
}
