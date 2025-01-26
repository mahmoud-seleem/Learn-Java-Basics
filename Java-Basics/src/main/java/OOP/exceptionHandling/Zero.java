package OOP.exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.function.Predicate;

public class Zero extends AutoClosing {
    public static void main(String[] args) throws Exception {
        
        AutoClosing a = new AutoClosing();
        AutoClosing b = new AutoClosing();
        try (a;b) {
            throw new ArithmeticException();
        } catch ( ArithmeticException | IOException e) {
            // e = new ArithmeticException("hello");
            System.out.println(e.getMessage());
            Predicate xxxx = (z) -> {
                if (z != null) return true ;
                else {
                    System.out.println(e);
                    return false;}
        };
    }
}
}
