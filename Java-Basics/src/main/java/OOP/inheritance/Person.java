package OOP.inheritance;

import OOP.polymorphism.Closable;
import OOP.polymorphism.Playable;

import java.io.Closeable;
import java.io.IOException;

public class Person extends Human implements Closeable {
    public int x = 5;
    static {
        System.out.println("init of person");
    }

    @Override
    public final void close()  {

    }
    @Override
    public final void play(){
        System.out.println("play");
    }
}
