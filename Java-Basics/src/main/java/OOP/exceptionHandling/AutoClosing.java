package OOP.exceptionHandling;

public class AutoClosing implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("AutoClosing class is closing now");
        throw new RuntimeException("exception from close");
    }
}
