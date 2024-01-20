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
        int xx = 10;
        try(AutoClosing a = new AutoClosing()) {
            int xxx = 5;
            div(x, y);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(xx);
        }
        //finally {
//            System.out.println("hIiiii");
//        }
    }
    public static int div(int q1,int q2){
        return q1/q2;
    }
}
