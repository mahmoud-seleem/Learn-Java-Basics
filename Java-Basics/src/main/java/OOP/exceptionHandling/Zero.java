package OOP.exceptionHandling;

import java.util.InputMismatchException;

public class Zero extends AutoClosing {
    public static void main(String[] args) throws Exception {
        try (AutoClosing a = new AutoClosing()){
            throw new ArithmeticException();
        }
    }
}
