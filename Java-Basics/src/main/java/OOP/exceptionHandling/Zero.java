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
    public static void catchTheException(int x , int y)throws Exception{
        try(AutoClosing a = new AutoClosing()) {
            div(x, y);
        }
//        }catch (IndexOutOfBoundsException e) {
//            System.out.println("hi");
//        }finally {
//            System.out.println("hIiiii");
//        }
    }
    public static int div(int q1,int q2){
        return q1/q2;
    }
}
