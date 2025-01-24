package OOP.exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.function.Predicate;

public class Zero extends AutoClosing {
    public static void main(String[] args) throws Exception {
        try (AutoClosing a = new AutoClosing()) {
            throw new ArithmeticException();
        } catch ( ArithmeticException  e) {
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
