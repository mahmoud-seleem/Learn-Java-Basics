package OOP.inheritance;

import java.io.Closeable;
import java.io.IOException;

public class Person extends Human implements Closeable {
    public int x = 5;
    static {
        System.out.println("init of person");
    }
    public static void print(){
        //m();

    }

    @Override
    public void close()  {

    }
}
